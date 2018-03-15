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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamFrameInfoResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamFrameInfoResponse.FrameDataModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamFrameInfoResponseUnmarshaller {

	public static DescribeLiveStreamFrameInfoResponse unmarshall(DescribeLiveStreamFrameInfoResponse describeLiveStreamFrameInfoResponse, UnmarshallerContext context) {
		
		describeLiveStreamFrameInfoResponse.setRequestId(context.stringValue("DescribeLiveStreamFrameInfoResponse.RequestId"));

		List<FrameDataModel> frameDataInfos = new ArrayList<FrameDataModel>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamFrameInfoResponse.FrameDataInfos.Length"); i++) {
			FrameDataModel frameDataModel = new FrameDataModel();
			frameDataModel.setTime(context.stringValue("DescribeLiveStreamFrameInfoResponse.FrameDataInfos["+ i +"].Time"));
			frameDataModel.setStream(context.stringValue("DescribeLiveStreamFrameInfoResponse.FrameDataInfos["+ i +"].Stream"));
			frameDataModel.setClientAddr(context.stringValue("DescribeLiveStreamFrameInfoResponse.FrameDataInfos["+ i +"].ClientAddr"));
			frameDataModel.setServer(context.stringValue("DescribeLiveStreamFrameInfoResponse.FrameDataInfos["+ i +"].Server"));
			frameDataModel.setAudioRate(context.floatValue("DescribeLiveStreamFrameInfoResponse.FrameDataInfos["+ i +"].AudioRate"));
			frameDataModel.setAudioByte(context.floatValue("DescribeLiveStreamFrameInfoResponse.FrameDataInfos["+ i +"].AudioByte"));
			frameDataModel.setFrameRate(context.floatValue("DescribeLiveStreamFrameInfoResponse.FrameDataInfos["+ i +"].FrameRate"));
			frameDataModel.setFrameByte(context.floatValue("DescribeLiveStreamFrameInfoResponse.FrameDataInfos["+ i +"].FrameByte"));

			frameDataInfos.add(frameDataModel);
		}
		describeLiveStreamFrameInfoResponse.setFrameDataInfos(frameDataInfos);
	 
	 	return describeLiveStreamFrameInfoResponse;
	}
}