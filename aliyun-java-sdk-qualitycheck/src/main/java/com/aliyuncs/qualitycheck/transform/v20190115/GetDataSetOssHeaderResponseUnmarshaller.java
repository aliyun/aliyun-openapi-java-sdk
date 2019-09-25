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

import com.aliyuncs.qualitycheck.model.v20190115.GetDataSetOssHeaderResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetDataSetOssHeaderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataSetOssHeaderResponseUnmarshaller {

	public static GetDataSetOssHeaderResponse unmarshall(GetDataSetOssHeaderResponse getDataSetOssHeaderResponse, UnmarshallerContext _ctx) {
		
		getDataSetOssHeaderResponse.setRequestId(_ctx.stringValue("GetDataSetOssHeaderResponse.RequestId"));
		getDataSetOssHeaderResponse.setSuccess(_ctx.booleanValue("GetDataSetOssHeaderResponse.Success"));
		getDataSetOssHeaderResponse.setCode(_ctx.stringValue("GetDataSetOssHeaderResponse.Code"));
		getDataSetOssHeaderResponse.setMessage(_ctx.stringValue("GetDataSetOssHeaderResponse.Message"));

		Data data = new Data();
		data.setOSSAccessKeyId(_ctx.stringValue("GetDataSetOssHeaderResponse.Data.OSSAccessKeyId"));
		data.setPolicy(_ctx.stringValue("GetDataSetOssHeaderResponse.Data.Policy"));
		data.setSignature(_ctx.stringValue("GetDataSetOssHeaderResponse.Data.Signature"));
		data.setKey(_ctx.stringValue("GetDataSetOssHeaderResponse.Data.Key"));
		data.setSubDir(_ctx.stringValue("GetDataSetOssHeaderResponse.Data.SubDir"));
		data.setPostUrl(_ctx.stringValue("GetDataSetOssHeaderResponse.Data.PostUrl"));
		getDataSetOssHeaderResponse.setData(data);
	 
	 	return getDataSetOssHeaderResponse;
	}
}