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

import com.aliyuncs.dataphin_public.model.v20230630.GetQualityArchiveTableProgressResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityArchiveTableProgressResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityArchiveTableProgressResponseUnmarshaller {

	public static GetQualityArchiveTableProgressResponse unmarshall(GetQualityArchiveTableProgressResponse getQualityArchiveTableProgressResponse, UnmarshallerContext _ctx) {
		
		getQualityArchiveTableProgressResponse.setRequestId(_ctx.stringValue("GetQualityArchiveTableProgressResponse.RequestId"));
		getQualityArchiveTableProgressResponse.setMessage(_ctx.stringValue("GetQualityArchiveTableProgressResponse.Message"));
		getQualityArchiveTableProgressResponse.setHttpStatusCode(_ctx.integerValue("GetQualityArchiveTableProgressResponse.HttpStatusCode"));
		getQualityArchiveTableProgressResponse.setCode(_ctx.stringValue("GetQualityArchiveTableProgressResponse.Code"));
		getQualityArchiveTableProgressResponse.setSuccess(_ctx.booleanValue("GetQualityArchiveTableProgressResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetQualityArchiveTableProgressResponse.Data.Status"));
		data.setArchiveTableName(_ctx.stringValue("GetQualityArchiveTableProgressResponse.Data.ArchiveTableName"));
		data.setArchiveTableId(_ctx.longValue("GetQualityArchiveTableProgressResponse.Data.ArchiveTableId"));
		data.setErrorMessage(_ctx.stringValue("GetQualityArchiveTableProgressResponse.Data.ErrorMessage"));
		getQualityArchiveTableProgressResponse.setData(data);
	 
	 	return getQualityArchiveTableProgressResponse;
	}
}