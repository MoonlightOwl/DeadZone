package su.u_c.deadzone

import com.badlogic.gdx.{ApplicationAdapter, Gdx}
import com.badlogic.gdx.graphics.{Camera, GL20, OrthographicCamera, Texture}
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.viewport.{ScreenViewport, Viewport}


class DeadZone extends ApplicationAdapter {
  var Width: Int = _
  var Height: Int = _
  var batch: SpriteBatch = _
  var img: Texture = _
  var viewport: Viewport = _
  var camera: Camera = _

  override def create(): Unit = {
    batch = new SpriteBatch()
    camera = new OrthographicCamera()
    viewport = new ScreenViewport(camera)
    img = new Texture("logo.png")
  }

  override def resize(width: Int, height: Int): Unit = {
    Width = width
    Height = height
    viewport.update(width, height)
  }

  override def render(): Unit = {
    batch.setProjectionMatrix(camera.projection)
    batch.setTransformMatrix(camera.view)

    Gdx.gl.glClearColor(0.05f, 0.05f, 0.05f, 1)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

    batch.begin()
    batch.draw(img, -img.getWidth/2, -img.getHeight/2)
    batch.end()
  }

  override def dispose(): Unit = {
    batch.dispose()
    img.dispose()
  }
}