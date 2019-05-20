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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.Upload400CorpIdentifyFileResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.Upload400CorpIdentifyFileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class Upload400CorpIdentifyFileResponseUnmarshaller {

	public static Upload400CorpIdentifyFileResponse unmarshall(Upload400CorpIdentifyFileResponse upload400CorpIdentifyFileResponse, UnmarshallerContext context) {
		
		upload400CorpIdentifyFileResponse.setRequestId(context.stringValue("Upload400CorpIdentifyFileResponse.RequestId"));
		upload400CorpIdentifyFileResponse.setSuccess(context.booleanValue("Upload400CorpIdentifyFileResponse.Success"));
		upload400CorpIdentifyFileResponse.setCode(context.stringValue("Upload400CorpIdentifyFileResponse.Code"));
		upload400CorpIdentifyFileResponse.setMessage(context.stringValue("Upload400CorpIdentifyFileResponse.Message"));
		upload400CorpIdentifyFileResponse.setHttpStatusCode(context.integerValue("Upload400CorpIdentifyFileResponse.HttpStatusCode"));

		Data data = new Data();
		data.setOssUrl(context.stringValue("Upload400CorpIdentifyFileResponse.Data.OssUrl"));
		data.setFileName(context.stringValue("Upload400CorpIdentifyFileResponse.Data.FileName"));
		upload400CorpIdentifyFileResponse.setData(data);
	 
	 	return upload400CorpIdentifyFileResponse;
	}
}