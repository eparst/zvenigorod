package controllers

import controllers._

object RemoteAssets extends Remote {
    def call(file:String) = {
        controllers.routes.RemoteAssets.at(file)
    }
}