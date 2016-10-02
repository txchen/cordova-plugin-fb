/*global cordova, module*/
module.exports = {
  sendActivateAppEvent: function () {
    console.log('Trying to call FacebookPlugin.sendActivateAppEvent')
    cordova.exec(function() {}, function() {}, 'FacebookPlugin', 'sendActivateAppEvent', [])
  }
}
