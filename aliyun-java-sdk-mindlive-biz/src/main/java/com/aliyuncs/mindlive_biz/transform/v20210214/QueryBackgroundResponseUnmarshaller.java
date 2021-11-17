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

import com.aliyuncs.mindlive_biz.model.v20210214.QueryBackgroundResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryBackgroundResponse.UserResourceDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBackgroundResponseUnmarshaller {

	public static QueryBackgroundResponse unmarshall(QueryBackgroundResponse queryBackgroundResponse, UnmarshallerContext _ctx) {
		
		queryBackgroundResponse.setRequestId(_ctx.stringValue("QueryBackgroundResponse.RequestId"));
		queryBackgroundResponse.setErrorMessage(_ctx.stringValue("QueryBackgroundResponse.ErrorMessage"));
		queryBackgroundResponse.setSuccess(_ctx.booleanValue("QueryBackgroundResponse.Success"));
		queryBackgroundResponse.setErrorCode(_ctx.stringValue("QueryBackgroundResponse.ErrorCode"));

		List<UserResourceDTO> data = new ArrayList<UserResourceDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryBackgroundResponse.Data.Length"); i++) {
			UserResourceDTO userResourceDTO = new UserResourceDTO();
			userResourceDTO.setUuid(_ctx.stringValue("QueryBackgroundResponse.Data["+ i +"].Uuid"));
			userResourceDTO.setName(_ctx.stringValue("QueryBackgroundResponse.Data["+ i +"].Name"));
			userResourceDTO.setDownloadUrl(_ctx.stringValue("QueryBackgroundResponse.Data["+ i +"].DownloadUrl"));
			userResourceDTO.setFileType(_ctx.stringValue("QueryBackgroundResponse.Data["+ i +"].FileType"));
			userResourceDTO.setSizeInBytes(_ctx.integerValue("QueryBackgroundResponse.Data["+ i +"].SizeInBytes"));

			data.add(userResourceDTO);
		}
		queryBackgroundResponse.setData(data);
	 
	 	return queryBackgroundResponse;
	}
}