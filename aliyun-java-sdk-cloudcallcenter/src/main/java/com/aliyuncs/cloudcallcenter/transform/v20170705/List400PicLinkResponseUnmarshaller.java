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

import com.aliyuncs.cloudcallcenter.model.v20170705.List400PicLinkResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.List400PicLinkResponse.CorpIdentifyPicDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class List400PicLinkResponseUnmarshaller {

	public static List400PicLinkResponse unmarshall(List400PicLinkResponse list400PicLinkResponse, UnmarshallerContext context) {
		
		list400PicLinkResponse.setRequestId(context.stringValue("List400PicLinkResponse.RequestId"));
		list400PicLinkResponse.setSuccess(context.booleanValue("List400PicLinkResponse.Success"));
		list400PicLinkResponse.setCode(context.stringValue("List400PicLinkResponse.Code"));
		list400PicLinkResponse.setMessage(context.stringValue("List400PicLinkResponse.Message"));
		list400PicLinkResponse.setHttpStatusCode(context.integerValue("List400PicLinkResponse.HttpStatusCode"));

		List<CorpIdentifyPicDomain> data = new ArrayList<CorpIdentifyPicDomain>();
		for (int i = 0; i < context.lengthValue("List400PicLinkResponse.Data.Length"); i++) {
			CorpIdentifyPicDomain corpIdentifyPicDomain = new CorpIdentifyPicDomain();
			corpIdentifyPicDomain.setPic(context.stringValue("List400PicLinkResponse.Data["+ i +"].Pic"));
			corpIdentifyPicDomain.setLink(context.stringValue("List400PicLinkResponse.Data["+ i +"].Link"));

			data.add(corpIdentifyPicDomain);
		}
		list400PicLinkResponse.setData(data);
	 
	 	return list400PicLinkResponse;
	}
}