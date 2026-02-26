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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetSecurityLevelResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetSecurityLevelResponse.SecurityLevelInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecurityLevelResponseUnmarshaller {

	public static GetSecurityLevelResponse unmarshall(GetSecurityLevelResponse getSecurityLevelResponse, UnmarshallerContext _ctx) {
		
		getSecurityLevelResponse.setRequestId(_ctx.stringValue("GetSecurityLevelResponse.RequestId"));
		getSecurityLevelResponse.setSuccess(_ctx.booleanValue("GetSecurityLevelResponse.Success"));
		getSecurityLevelResponse.setHttpStatusCode(_ctx.integerValue("GetSecurityLevelResponse.HttpStatusCode"));
		getSecurityLevelResponse.setCode(_ctx.stringValue("GetSecurityLevelResponse.Code"));
		getSecurityLevelResponse.setMessage(_ctx.stringValue("GetSecurityLevelResponse.Message"));

		SecurityLevelInfo securityLevelInfo = new SecurityLevelInfo();
		securityLevelInfo.setName(_ctx.stringValue("GetSecurityLevelResponse.SecurityLevelInfo.Name"));
		securityLevelInfo.setAbbreviation(_ctx.stringValue("GetSecurityLevelResponse.SecurityLevelInfo.Abbreviation"));
		securityLevelInfo.setDescription(_ctx.stringValue("GetSecurityLevelResponse.SecurityLevelInfo.Description"));
		securityLevelInfo.setIndex(_ctx.longValue("GetSecurityLevelResponse.SecurityLevelInfo.Index"));

		List<Long> relatedClassifyIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetSecurityLevelResponse.SecurityLevelInfo.RelatedClassifyIdList.Length"); i++) {
			relatedClassifyIdList.add(_ctx.longValue("GetSecurityLevelResponse.SecurityLevelInfo.RelatedClassifyIdList["+ i +"]"));
		}
		securityLevelInfo.setRelatedClassifyIdList(relatedClassifyIdList);
		getSecurityLevelResponse.setSecurityLevelInfo(securityLevelInfo);
	 
	 	return getSecurityLevelResponse;
	}
}