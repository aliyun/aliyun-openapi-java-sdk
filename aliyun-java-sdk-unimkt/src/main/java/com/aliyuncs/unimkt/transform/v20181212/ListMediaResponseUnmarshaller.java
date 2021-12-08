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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.ListMediaResponse;
import com.aliyuncs.unimkt.model.v20181212.ListMediaResponse.Media;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMediaResponseUnmarshaller {

	public static ListMediaResponse unmarshall(ListMediaResponse listMediaResponse, UnmarshallerContext _ctx) {
		
		listMediaResponse.setRequestId(_ctx.stringValue("ListMediaResponse.RequestId"));
		listMediaResponse.setSuccess(_ctx.booleanValue("ListMediaResponse.Success"));
		listMediaResponse.setCode(_ctx.stringValue("ListMediaResponse.Code"));
		listMediaResponse.setMessage(_ctx.stringValue("ListMediaResponse.Message"));
		listMediaResponse.setPageNumber(_ctx.integerValue("ListMediaResponse.PageNumber"));
		listMediaResponse.setPageSize(_ctx.integerValue("ListMediaResponse.PageSize"));
		listMediaResponse.setTotal(_ctx.longValue("ListMediaResponse.Total"));

		List<Media> model = new ArrayList<Media>();
		for (int i = 0; i < _ctx.lengthValue("ListMediaResponse.Model.Length"); i++) {
			Media media = new Media();
			media.setAccessWay(_ctx.stringValue("ListMediaResponse.Model["+ i +"].AccessWay"));
			media.setSecondScene(_ctx.stringValue("ListMediaResponse.Model["+ i +"].SecondScene"));
			media.setCreateTime(_ctx.longValue("ListMediaResponse.Model["+ i +"].CreateTime"));
			media.setMediaName(_ctx.stringValue("ListMediaResponse.Model["+ i +"].MediaName"));
			media.setOs(_ctx.stringValue("ListMediaResponse.Model["+ i +"].Os"));
			media.setMediaType(_ctx.stringValue("ListMediaResponse.Model["+ i +"].MediaType"));
			media.setExtInfo(_ctx.stringValue("ListMediaResponse.Model["+ i +"].ExtInfo"));
			media.setMediaId(_ctx.stringValue("ListMediaResponse.Model["+ i +"].MediaId"));
			media.setConfig(_ctx.stringValue("ListMediaResponse.Model["+ i +"].Config"));
			media.setVersion(_ctx.longValue("ListMediaResponse.Model["+ i +"].Version"));
			media.setMediaStatus(_ctx.stringValue("ListMediaResponse.Model["+ i +"].MediaStatus"));
			media.setKeyWords(_ctx.stringValue("ListMediaResponse.Model["+ i +"].KeyWords"));
			media.setAccessStatus(_ctx.stringValue("ListMediaResponse.Model["+ i +"].AccessStatus"));
			media.setFirstScene(_ctx.stringValue("ListMediaResponse.Model["+ i +"].FirstScene"));
			media.setModifyTime(_ctx.longValue("ListMediaResponse.Model["+ i +"].ModifyTime"));
			media.setTenantId(_ctx.stringValue("ListMediaResponse.Model["+ i +"].TenantId"));

			model.add(media);
		}
		listMediaResponse.setModel(model);
	 
	 	return listMediaResponse;
	}
}