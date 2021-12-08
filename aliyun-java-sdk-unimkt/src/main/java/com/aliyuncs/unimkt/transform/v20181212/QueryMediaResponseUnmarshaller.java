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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.QueryMediaResponse;
import com.aliyuncs.unimkt.model.v20181212.QueryMediaResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaResponseUnmarshaller {

	public static QueryMediaResponse unmarshall(QueryMediaResponse queryMediaResponse, UnmarshallerContext _ctx) {
		
		queryMediaResponse.setRequestId(_ctx.stringValue("QueryMediaResponse.RequestId"));
		queryMediaResponse.setCode(_ctx.stringValue("QueryMediaResponse.Code"));
		queryMediaResponse.setMessage(_ctx.stringValue("QueryMediaResponse.Message"));
		queryMediaResponse.setSuccess(_ctx.booleanValue("QueryMediaResponse.Success"));

		Model model = new Model();
		model.setAccessWay(_ctx.stringValue("QueryMediaResponse.Model.AccessWay"));
		model.setSecondScene(_ctx.stringValue("QueryMediaResponse.Model.SecondScene"));
		model.setCreateTime(_ctx.longValue("QueryMediaResponse.Model.CreateTime"));
		model.setMediaName(_ctx.stringValue("QueryMediaResponse.Model.MediaName"));
		model.setOs(_ctx.stringValue("QueryMediaResponse.Model.Os"));
		model.setMediaType(_ctx.stringValue("QueryMediaResponse.Model.MediaType"));
		model.setExtInfo(_ctx.stringValue("QueryMediaResponse.Model.ExtInfo"));
		model.setMediaId(_ctx.stringValue("QueryMediaResponse.Model.MediaId"));
		model.setConfig(_ctx.stringValue("QueryMediaResponse.Model.Config"));
		model.setVersion(_ctx.longValue("QueryMediaResponse.Model.Version"));
		model.setMediaStatus(_ctx.stringValue("QueryMediaResponse.Model.MediaStatus"));
		model.setKeyWords(_ctx.stringValue("QueryMediaResponse.Model.KeyWords"));
		model.setAccessStatus(_ctx.stringValue("QueryMediaResponse.Model.AccessStatus"));
		model.setFirstScene(_ctx.stringValue("QueryMediaResponse.Model.FirstScene"));
		model.setModifyTime(_ctx.longValue("QueryMediaResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("QueryMediaResponse.Model.TenantId"));
		queryMediaResponse.setModel(model);
	 
	 	return queryMediaResponse;
	}
}