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

package com.aliyuncs.cloudauth.transform.v20190307;

import com.aliyuncs.cloudauth.model.v20190307.InitDeviceResponse;
import com.aliyuncs.cloudauth.model.v20190307.InitDeviceResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitDeviceResponseUnmarshaller {

	public static InitDeviceResponse unmarshall(InitDeviceResponse initDeviceResponse, UnmarshallerContext _ctx) {
		
		initDeviceResponse.setRequestId(_ctx.stringValue("InitDeviceResponse.RequestId"));
		initDeviceResponse.setMessage(_ctx.stringValue("InitDeviceResponse.Message"));
		initDeviceResponse.setCode(_ctx.stringValue("InitDeviceResponse.Code"));

		ResultObject resultObject = new ResultObject();
		resultObject.setCertifyId(_ctx.stringValue("InitDeviceResponse.ResultObject.CertifyId"));
		resultObject.setBizProtocol(_ctx.stringValue("InitDeviceResponse.ResultObject.Protocol"));
		resultObject.setExtParams(_ctx.stringValue("InitDeviceResponse.ResultObject.ExtParams"));
		resultObject.setRetCode(_ctx.stringValue("InitDeviceResponse.ResultObject.RetCode"));
		resultObject.setRetCodeSub(_ctx.stringValue("InitDeviceResponse.ResultObject.RetCodeSub"));
		resultObject.setRetMessageSub(_ctx.stringValue("InitDeviceResponse.ResultObject.RetMessageSub"));
		resultObject.setMessage(_ctx.stringValue("InitDeviceResponse.ResultObject.Message"));
		resultObject.setOssEndPoint(_ctx.stringValue("InitDeviceResponse.ResultObject.OssEndPoint"));
		resultObject.setAccessKeyId(_ctx.stringValue("InitDeviceResponse.ResultObject.AccessKeyId"));
		resultObject.setAccessKeySecret(_ctx.stringValue("InitDeviceResponse.ResultObject.AccessKeySecret"));
		resultObject.setSecurityToken(_ctx.stringValue("InitDeviceResponse.ResultObject.SecurityToken"));
		resultObject.setBucketName(_ctx.stringValue("InitDeviceResponse.ResultObject.BucketName"));
		resultObject.setFileNamePrefix(_ctx.stringValue("InitDeviceResponse.ResultObject.FileNamePrefix"));
		initDeviceResponse.setResultObject(resultObject);
	 
	 	return initDeviceResponse;
	}
}