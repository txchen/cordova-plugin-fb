/*global cordova, module*/
module.exports = {
  sendActivateAppEvent: function () {
    cordova.exec(function() {}, function() {}, 'FacebookPlugin', 'sendActivateAppEvent', [])
  }
}
