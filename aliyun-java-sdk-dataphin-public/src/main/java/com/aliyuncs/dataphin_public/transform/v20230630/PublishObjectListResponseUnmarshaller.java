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

import com.aliyuncs.dataphin_public.model.v20230630.PublishObjectListResponse;
import com.aliyuncs.dataphin_public.model.v20230630.PublishObjectListResponse.PublishResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublishObjectListResponseUnmarshaller {

	public static PublishObjectListResponse unmarshall(PublishObjectListResponse publishObjectListResponse, UnmarshallerContext _ctx) {
		
		publishObjectListResponse.setRequestId(_ctx.stringValue("PublishObjectListResponse.RequestId"));
		publishObjectListResponse.setSuccess(_ctx.booleanValue("PublishObjectListResponse.Success"));
		publishObjectListResponse.setHttpStatusCode(_ctx.integerValue("PublishObjectListResponse.HttpStatusCode"));
		publishObjectListResponse.setCode(_ctx.stringValue("PublishObjectListResponse.Code"));
		publishObjectListResponse.setMessage(_ctx.stringValue("PublishObjectListResponse.Message"));

		PublishResult publishResult = new PublishResult();

		List<Long> submitIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("PublishObjectListResponse.PublishResult.SubmitIdList.Length"); i++) {
			submitIdList.add(_ctx.longValue("PublishObjectListResponse.PublishResult.SubmitIdList["+ i +"]"));
		}
		publishResult.setSubmitIdList(submitIdList);
		publishObjectListResponse.setPublishResult(publishResult);
	 
	 	return publishObjectListResponse;
	}
}