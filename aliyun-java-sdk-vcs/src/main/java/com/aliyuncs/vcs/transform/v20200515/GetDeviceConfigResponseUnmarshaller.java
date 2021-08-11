/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.GetDeviceConfigResponse;
import com.aliyuncs.vcs.model.v20200515.GetDeviceConfigResponse.ChannelListItem;
import com.aliyuncs.vcs.model.v20200515.GetDeviceConfigResponse.OSDListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceConfigResponseUnmarshaller {

	public static GetDeviceConfigResponse unmarshall(GetDeviceConfigResponse getDeviceConfigResponse, UnmarshallerContext _ctx) {
		
		getDeviceConfigResponse.setRequestId(_ctx.stringValue("GetDeviceConfigResponse.RequestId"));
		getDeviceConfigResponse.setMessage(_ctx.stringValue("GetDeviceConfigResponse.Message"));
		getDeviceConfigResponse.setRetryInterval(_ctx.stringValue("GetDeviceConfigResponse.RetryInterval"));
		getDeviceConfigResponse.setCode(_ctx.stringValue("GetDeviceConfigResponse.Code"));
		getDeviceConfigResponse.setAudioEnable(_ctx.stringValue("GetDeviceConfigResponse.AudioEnable"));
		getDeviceConfigResponse.setAudioFormat(_ctx.stringValue("GetDeviceConfigResponse.AudioFormat"));
		getDeviceConfigResponse.setBitRate(_ctx.stringValue("GetDeviceConfigResponse.BitRate"));
		getDeviceConfigResponse.setDeviceAddress(_ctx.stringValue("GetDeviceConfigResponse.DeviceAddress"));
		getDeviceConfigResponse.setDeviceName(_ctx.stringValue("GetDeviceConfigResponse.DeviceName"));
		getDeviceConfigResponse.setEncodeFormat(_ctx.stringValue("GetDeviceConfigResponse.EncodeFormat"));
		getDeviceConfigResponse.setFrameRate(_ctx.stringValue("GetDeviceConfigResponse.FrameRate"));
		getDeviceConfigResponse.setGovLength(_ctx.longValue("GetDeviceConfigResponse.GovLength"));
		getDeviceConfigResponse.setLatitude(_ctx.stringValue("GetDeviceConfigResponse.Latitude"));
		getDeviceConfigResponse.setLongitude(_ctx.stringValue("GetDeviceConfigResponse.Longitude"));
		getDeviceConfigResponse.setOSDTimeEnable(_ctx.stringValue("GetDeviceConfigResponse.OSDTimeEnable"));
		getDeviceConfigResponse.setOSDTimeType(_ctx.stringValue("GetDeviceConfigResponse.OSDTimeType"));
		getDeviceConfigResponse.setOSDTimeX(_ctx.stringValue("GetDeviceConfigResponse.OSDTimeX"));
		getDeviceConfigResponse.setOSDTimeY(_ctx.stringValue("GetDeviceConfigResponse.OSDTimeY"));
		getDeviceConfigResponse.setResolution(_ctx.stringValue("GetDeviceConfigResponse.Resolution"));
		getDeviceConfigResponse.setDeviceId(_ctx.stringValue("GetDeviceConfigResponse.DeviceId"));
		getDeviceConfigResponse.setUserName(_ctx.stringValue("GetDeviceConfigResponse.UserName"));
		getDeviceConfigResponse.setPassWord(_ctx.stringValue("GetDeviceConfigResponse.PassWord"));
		getDeviceConfigResponse.setBizProtocol(_ctx.stringValue("GetDeviceConfigResponse.Protocol"));
		getDeviceConfigResponse.setServerId(_ctx.stringValue("GetDeviceConfigResponse.ServerId"));
		getDeviceConfigResponse.setServerPort(_ctx.stringValue("GetDeviceConfigResponse.ServerPort"));
		getDeviceConfigResponse.setServerIp(_ctx.stringValue("GetDeviceConfigResponse.ServerIp"));

		List<OSDListItem> oSDList = new ArrayList<OSDListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDeviceConfigResponse.OSDList.Length"); i++) {
			OSDListItem oSDListItem = new OSDListItem();
			oSDListItem.setLeftTopX(_ctx.stringValue("GetDeviceConfigResponse.OSDList["+ i +"].LeftTopX"));
			oSDListItem.setLeftTopY(_ctx.stringValue("GetDeviceConfigResponse.OSDList["+ i +"].LeftTopY"));
			oSDListItem.setText(_ctx.stringValue("GetDeviceConfigResponse.OSDList["+ i +"].Text"));

			oSDList.add(oSDListItem);
		}
		getDeviceConfigResponse.setOSDList(oSDList);

		List<ChannelListItem> channelList = new ArrayList<ChannelListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDeviceConfigResponse.ChannelList.Length"); i++) {
			ChannelListItem channelListItem = new ChannelListItem();
			channelListItem.setChannelGbId(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].ChannelGbId"));
			channelListItem.setMondayCaptureStrategy(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].MondayCaptureStrategy"));
			channelListItem.setTuesdayCaptureStrategy(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].TuesdayCaptureStrategy"));
			channelListItem.setWednesdayCaptureStrategy(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].WednesdayCaptureStrategy"));
			channelListItem.setThursdayCaptureStrategy(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].ThursdayCaptureStrategy"));
			channelListItem.setFridayCaptureStrategy(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].FridayCaptureStrategy"));
			channelListItem.setSaturdayCaptureStrategy(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].SaturdayCaptureStrategy"));
			channelListItem.setSundayCaptureStrategy(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].SundayCaptureStrategy"));

			channelList.add(channelListItem);
		}
		getDeviceConfigResponse.setChannelList(channelList);
	 
	 	return getDeviceConfigResponse;
	}
}