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

package com.aliyuncs.live.transform.v20161101;

import com.aliyuncs.live.model.v20161101.DescribeLiveMessageAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveMessageAppResponseUnmarshaller {

	public static DescribeLiveMessageAppResponse unmarshall(DescribeLiveMessageAppResponse describeLiveMessageAppResponse, UnmarshallerContext _ctx) {
		
		describeLiveMessageAppResponse.setRequestId(_ctx.stringValue("DescribeLiveMessageAppResponse.RequestId"));
		describeLiveMessageAppResponse.setAppId(_ctx.stringValue("DescribeLiveMessageAppResponse.AppId"));
		describeLiveMessageAppResponse.setAppName(_ctx.stringValue("DescribeLiveMessageAppResponse.AppName"));
		describeLiveMessageAppResponse.setAppKey(_ctx.stringValue("DescribeLiveMessageAppResponse.AppKey"));
		describeLiveMessageAppResponse.setAppSign(_ctx.stringValue("DescribeLiveMessageAppResponse.AppSign"));
		describeLiveMessageAppResponse.setAuditType(_ctx.integerValue("DescribeLiveMessageAppResponse.AuditType"));
		describeLiveMessageAppResponse.setAuditUrl(_ctx.stringValue("DescribeLiveMessageAppResponse.AuditUrl"));
		describeLiveMessageAppResponse.setEventCallbackUrl(_ctx.stringValue("DescribeLiveMessageAppResponse.EventCallbackUrl"));
		describeLiveMessageAppResponse.setCallbackUrl(_ctx.stringValue("DescribeLiveMessageAppResponse.CallbackUrl"));
		describeLiveMessageAppResponse.setDisable(_ctx.booleanValue("DescribeLiveMessageAppResponse.Disable"));
		describeLiveMessageAppResponse.setCreateTime(_ctx.longValue("DescribeLiveMessageAppResponse.CreateTime"));
		describeLiveMessageAppResponse.setModifyTime(_ctx.longValue("DescribeLiveMessageAppResponse.ModifyTime"));
		describeLiveMessageAppResponse.setMsgLifeCycle(_ctx.integerValue("DescribeLiveMessageAppResponse.MsgLifeCycle"));
		describeLiveMessageAppResponse.setDataCenter(_ctx.stringValue("DescribeLiveMessageAppResponse.DataCenter"));
	 
	 	return describeLiveMessageAppResponse;
	}
}