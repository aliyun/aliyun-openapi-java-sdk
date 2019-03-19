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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.GetOssHeaderResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetOssHeaderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOssHeaderResponseUnmarshaller {

	public static GetOssHeaderResponse unmarshall(GetOssHeaderResponse getOssHeaderResponse, UnmarshallerContext context) {
		
		getOssHeaderResponse.setRequestId(context.stringValue("GetOssHeaderResponse.RequestId"));
		getOssHeaderResponse.setSuccess(context.booleanValue("GetOssHeaderResponse.Success"));
		getOssHeaderResponse.setCode(context.stringValue("GetOssHeaderResponse.Code"));
		getOssHeaderResponse.setMessage(context.stringValue("GetOssHeaderResponse.Message"));

		Data data = new Data();
		data.setOSSAccessKeyId(context.stringValue("GetOssHeaderResponse.Data.OSSAccessKeyId"));
		data.setPolicy(context.stringValue("GetOssHeaderResponse.Data.Policy"));
		data.setSignature(context.stringValue("GetOssHeaderResponse.Data.Signature"));
		data.setKey(context.stringValue("GetOssHeaderResponse.Data.Key"));
		data.setSubDir(context.stringValue("GetOssHeaderResponse.Data.SubDir"));
		data.setPostUrl(context.stringValue("GetOssHeaderResponse.Data.PostUrl"));
		getOssHeaderResponse.setData(data);
	 
	 	return getOssHeaderResponse;
	}
}