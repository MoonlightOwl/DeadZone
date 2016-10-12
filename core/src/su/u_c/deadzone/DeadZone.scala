package su.u_c.deadzone

import com.badlogic.gdx.{ApplicationAdapter, Gdx}
import com.badlogic.gdx.graphics.{GL20, Texture}
import com.badlogic.gdx.graphics.g2d.SpriteBatch


class DeadZone extends ApplicationAdapter {
  var batch: SpriteBatch = _
  var img: Texture = _

  override def create(): Unit = {
    batch = new SpriteBatch()
    img = new Texture("badlogic.jpg")
  }

  override def render(): Unit = {
    Gdx.gl.glClearColor(1, 0, 0, 1)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
    batch.begin()
    batch.draw(img, 0, 0)
    batch.end()
  }

  override def dispose(): Unit = {
    batch.dispose()
    img.dispose()
  }
}