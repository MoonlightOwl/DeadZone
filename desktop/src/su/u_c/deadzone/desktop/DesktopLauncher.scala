package su.u_c.deadzone.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import su.u_c.deadzone.DeadZone

object DesktopLauncher {
	def main(arg: Array[String]) {
		val config = new LwjglApplicationConfiguration
		new LwjglApplication(new DeadZone(arg), config)
	}
}