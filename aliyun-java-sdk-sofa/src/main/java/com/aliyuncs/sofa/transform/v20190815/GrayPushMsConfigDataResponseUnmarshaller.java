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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GrayPushMsConfigDataResponse;
import com.aliyuncs.sofa.model.v20190815.GrayPushMsConfigDataResponse.PushResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GrayPushMsConfigDataResponseUnmarshaller {

	public static GrayPushMsConfigDataResponse unmarshall(GrayPushMsConfigDataResponse grayPushMsConfigDataResponse, UnmarshallerContext _ctx) {
		
		grayPushMsConfigDataResponse.setRequestId(_ctx.stringValue("GrayPushMsConfigDataResponse.RequestId"));
		grayPushMsConfigDataResponse.setResultCode(_ctx.stringValue("GrayPushMsConfigDataResponse.ResultCode"));
		grayPushMsConfigDataResponse.setResultMessage(_ctx.stringValue("GrayPushMsConfigDataResponse.ResultMessage"));

		List<PushResultItem> pushResult = new ArrayList<PushResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GrayPushMsConfigDataResponse.PushResult.Length"); i++) {
			PushResultItem pushResultItem = new PushResultItem();
			pushResultItem.setHost(_ctx.stringValue("GrayPushMsConfigDataResponse.PushResult["+ i +"].Host"));
			pushResultItem.setSuccess(_ctx.booleanValue("GrayPushMsConfigDataResponse.PushResult["+ i +"].Success"));

			pushResult.add(pushResultItem);
		}
		grayPushMsConfigDataResponse.setPushResult(pushResult);
	 
	 	return grayPushMsConfigDataResponse;
	}
}