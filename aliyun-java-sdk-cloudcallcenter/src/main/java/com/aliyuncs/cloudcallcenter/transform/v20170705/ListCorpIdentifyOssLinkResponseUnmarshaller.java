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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListCorpIdentifyOssLinkResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListCorpIdentifyOssLinkResponse.CorpIdentifyPicDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCorpIdentifyOssLinkResponseUnmarshaller {

	public static ListCorpIdentifyOssLinkResponse unmarshall(ListCorpIdentifyOssLinkResponse listCorpIdentifyOssLinkResponse, UnmarshallerContext context) {
		
		listCorpIdentifyOssLinkResponse.setRequestId(context.stringValue("ListCorpIdentifyOssLinkResponse.RequestId"));
		listCorpIdentifyOssLinkResponse.setSuccess(context.booleanValue("ListCorpIdentifyOssLinkResponse.Success"));
		listCorpIdentifyOssLinkResponse.setCode(context.stringValue("ListCorpIdentifyOssLinkResponse.Code"));
		listCorpIdentifyOssLinkResponse.setMessage(context.stringValue("ListCorpIdentifyOssLinkResponse.Message"));
		listCorpIdentifyOssLinkResponse.setHttpStatusCode(context.integerValue("ListCorpIdentifyOssLinkResponse.HttpStatusCode"));

		List<CorpIdentifyPicDomain> data = new ArrayList<CorpIdentifyPicDomain>();
		for (int i = 0; i < context.lengthValue("ListCorpIdentifyOssLinkResponse.Data.Length"); i++) {
			CorpIdentifyPicDomain corpIdentifyPicDomain = new CorpIdentifyPicDomain();
			corpIdentifyPicDomain.setPic(context.stringValue("ListCorpIdentifyOssLinkResponse.Data["+ i +"].Pic"));
			corpIdentifyPicDomain.setLink(context.stringValue("ListCorpIdentifyOssLinkResponse.Data["+ i +"].Link"));

			data.add(corpIdentifyPicDomain);
		}
		listCorpIdentifyOssLinkResponse.setData(data);
	 
	 	return listCorpIdentifyOssLinkResponse;
	}
}