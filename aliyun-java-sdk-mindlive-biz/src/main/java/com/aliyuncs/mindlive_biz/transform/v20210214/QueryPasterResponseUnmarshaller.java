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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mindlive_biz.model.v20210214.QueryPasterResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryPasterResponse.UserResourceDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPasterResponseUnmarshaller {

	public static QueryPasterResponse unmarshall(QueryPasterResponse queryPasterResponse, UnmarshallerContext _ctx) {
		
		queryPasterResponse.setRequestId(_ctx.stringValue("QueryPasterResponse.RequestId"));
		queryPasterResponse.setErrorMessage(_ctx.stringValue("QueryPasterResponse.ErrorMessage"));
		queryPasterResponse.setSuccess(_ctx.booleanValue("QueryPasterResponse.Success"));
		queryPasterResponse.setErrorCode(_ctx.stringValue("QueryPasterResponse.ErrorCode"));

		List<UserResourceDTO> data = new ArrayList<UserResourceDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryPasterResponse.Data.Length"); i++) {
			UserResourceDTO userResourceDTO = new UserResourceDTO();
			userResourceDTO.setUuid(_ctx.stringValue("QueryPasterResponse.Data["+ i +"].Uuid"));
			userResourceDTO.setName(_ctx.stringValue("QueryPasterResponse.Data["+ i +"].Name"));
			userResourceDTO.setDownloadUrl(_ctx.stringValue("QueryPasterResponse.Data["+ i +"].DownloadUrl"));
			userResourceDTO.setFileType(_ctx.stringValue("QueryPasterResponse.Data["+ i +"].FileType"));
			userResourceDTO.setSizeInBytes(_ctx.integerValue("QueryPasterResponse.Data["+ i +"].SizeInBytes"));

			data.add(userResourceDTO);
		}
		queryPasterResponse.setData(data);
	 
	 	return queryPasterResponse;
	}
}