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
		getDeviceConfigResponse.setEncodeFormat(_ctx.stringValue("GetDeviceConfigResponse.EncodeFormat"));
		getDeviceConfigResponse.setMessage(_ctx.stringValue("GetDeviceConfigResponse.Message"));
		getDeviceConfigResponse.setDeviceId(_ctx.stringValue("GetDeviceConfigResponse.DeviceId"));
		getDeviceConfigResponse.setLatitude(_ctx.stringValue("GetDeviceConfigResponse.Latitude"));
		getDeviceConfigResponse.setPassWord(_ctx.stringValue("GetDeviceConfigResponse.PassWord"));
		getDeviceConfigResponse.setOSDTimeY(_ctx.stringValue("GetDeviceConfigResponse.OSDTimeY"));
		getDeviceConfigResponse.setOSDTimeEnable(_ctx.stringValue("GetDeviceConfigResponse.OSDTimeEnable"));
		getDeviceConfigResponse.setServerId(_ctx.stringValue("GetDeviceConfigResponse.ServerId"));
		getDeviceConfigResponse.setDeviceAddress(_ctx.stringValue("GetDeviceConfigResponse.DeviceAddress"));
		getDeviceConfigResponse.setOSDTimeX(_ctx.stringValue("GetDeviceConfigResponse.OSDTimeX"));
		getDeviceConfigResponse.setGovLength(_ctx.longValue("GetDeviceConfigResponse.GovLength"));
		getDeviceConfigResponse.setBizProtocol(_ctx.stringValue("GetDeviceConfigResponse.Protocol"));
		getDeviceConfigResponse.setAudioFormat(_ctx.stringValue("GetDeviceConfigResponse.AudioFormat"));
		getDeviceConfigResponse.setAudioEnable(_ctx.stringValue("GetDeviceConfigResponse.AudioEnable"));
		getDeviceConfigResponse.setFrameRate(_ctx.stringValue("GetDeviceConfigResponse.FrameRate"));
		getDeviceConfigResponse.setUserName(_ctx.stringValue("GetDeviceConfigResponse.UserName"));
		getDeviceConfigResponse.setServerIp(_ctx.stringValue("GetDeviceConfigResponse.ServerIp"));
		getDeviceConfigResponse.setLongitude(_ctx.stringValue("GetDeviceConfigResponse.Longitude"));
		getDeviceConfigResponse.setCode(_ctx.stringValue("GetDeviceConfigResponse.Code"));
		getDeviceConfigResponse.setRetryInterval(_ctx.stringValue("GetDeviceConfigResponse.RetryInterval"));
		getDeviceConfigResponse.setBitRate(_ctx.stringValue("GetDeviceConfigResponse.BitRate"));
		getDeviceConfigResponse.setServerPort(_ctx.stringValue("GetDeviceConfigResponse.ServerPort"));
		getDeviceConfigResponse.setResolution(_ctx.stringValue("GetDeviceConfigResponse.Resolution"));
		getDeviceConfigResponse.setOSDTimeType(_ctx.stringValue("GetDeviceConfigResponse.OSDTimeType"));
		getDeviceConfigResponse.setDeviceName(_ctx.stringValue("GetDeviceConfigResponse.DeviceName"));

		List<ChannelListItem> channelList = new ArrayList<ChannelListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDeviceConfigResponse.ChannelList.Length"); i++) {
			ChannelListItem channelListItem = new ChannelListItem();
			channelListItem.setSundayCaptureStrategy(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].SundayCaptureStrategy"));
			channelListItem.setMondayCaptureStrategy(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].MondayCaptureStrategy"));
			channelListItem.setChannelGbId(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].ChannelGbId"));
			channelListItem.setFridayCaptureStrategy(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].FridayCaptureStrategy"));
			channelListItem.setTuesdayCaptureStrategy(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].TuesdayCaptureStrategy"));
			channelListItem.setWednesdayCaptureStrategy(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].WednesdayCaptureStrategy"));
			channelListItem.setThursdayCaptureStrategy(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].ThursdayCaptureStrategy"));
			channelListItem.setSaturdayCaptureStrategy(_ctx.stringValue("GetDeviceConfigResponse.ChannelList["+ i +"].SaturdayCaptureStrategy"));

			channelList.add(channelListItem);
		}
		getDeviceConfigResponse.setChannelList(channelList);

		List<OSDListItem> oSDList = new ArrayList<OSDListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDeviceConfigResponse.OSDList.Length"); i++) {
			OSDListItem oSDListItem = new OSDListItem();
			oSDListItem.setText(_ctx.stringValue("GetDeviceConfigResponse.OSDList["+ i +"].Text"));
			oSDListItem.setLeftTopY(_ctx.stringValue("GetDeviceConfigResponse.OSDList["+ i +"].LeftTopY"));
			oSDListItem.setLeftTopX(_ctx.stringValue("GetDeviceConfigResponse.OSDList["+ i +"].LeftTopX"));

			oSDList.add(oSDListItem);
		}
		getDeviceConfigResponse.setOSDList(oSDList);
	 
	 	return getDeviceConfigResponse;
	}
}