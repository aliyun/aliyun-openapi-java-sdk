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
		initDeviceResponse.setCode(_ctx.stringValue("InitDeviceResponse.Code"));
		initDeviceResponse.setMessage(_ctx.stringValue("InitDeviceResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setOssEndPoint(_ctx.stringValue("InitDeviceResponse.ResultObject.OssEndPoint"));
		resultObject.setRetCodeSub(_ctx.stringValue("InitDeviceResponse.ResultObject.RetCodeSub"));
		resultObject.setBizProtocol(_ctx.stringValue("InitDeviceResponse.ResultObject.Protocol"));
		resultObject.setCertifyId(_ctx.stringValue("InitDeviceResponse.ResultObject.CertifyId"));
		resultObject.setExtParams(_ctx.stringValue("InitDeviceResponse.ResultObject.ExtParams"));
		resultObject.setMessage(_ctx.stringValue("InitDeviceResponse.ResultObject.Message"));
		resultObject.setFileName(_ctx.stringValue("InitDeviceResponse.ResultObject.FileName"));
		resultObject.setAccessKeyId(_ctx.stringValue("InitDeviceResponse.ResultObject.AccessKeyId"));
		resultObject.setPresignedUrl(_ctx.stringValue("InitDeviceResponse.ResultObject.PresignedUrl"));
		resultObject.setSecurityToken(_ctx.stringValue("InitDeviceResponse.ResultObject.SecurityToken"));
		resultObject.setFileNamePrefix(_ctx.stringValue("InitDeviceResponse.ResultObject.FileNamePrefix"));
		resultObject.setBucketName(_ctx.stringValue("InitDeviceResponse.ResultObject.BucketName"));
		resultObject.setAccessKeySecret(_ctx.stringValue("InitDeviceResponse.ResultObject.AccessKeySecret"));
		resultObject.setRetMessageSub(_ctx.stringValue("InitDeviceResponse.ResultObject.RetMessageSub"));
		resultObject.setRetCode(_ctx.stringValue("InitDeviceResponse.ResultObject.RetCode"));
		initDeviceResponse.setResultObject(resultObject);
	 
	 	return initDeviceResponse;
	}
}