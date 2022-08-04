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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryOfficialFileCustomListResponse;
import com.aliyuncs.trademark.model.v20180724.QueryOfficialFileCustomListResponse.CustomList;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOfficialFileCustomListResponseUnmarshaller {

	public static QueryOfficialFileCustomListResponse unmarshall(QueryOfficialFileCustomListResponse queryOfficialFileCustomListResponse, UnmarshallerContext _ctx) {
		
		queryOfficialFileCustomListResponse.setRequestId(_ctx.stringValue("QueryOfficialFileCustomListResponse.RequestId"));
		queryOfficialFileCustomListResponse.setCurrentPageNum(_ctx.integerValue("QueryOfficialFileCustomListResponse.CurrentPageNum"));
		queryOfficialFileCustomListResponse.setTotalPageNum(_ctx.integerValue("QueryOfficialFileCustomListResponse.TotalPageNum"));
		queryOfficialFileCustomListResponse.setPageSize(_ctx.integerValue("QueryOfficialFileCustomListResponse.PageSize"));
		queryOfficialFileCustomListResponse.setTotalItemNum(_ctx.integerValue("QueryOfficialFileCustomListResponse.TotalItemNum"));

		List<CustomList> data = new ArrayList<CustomList>();
		for (int i = 0; i < _ctx.lengthValue("QueryOfficialFileCustomListResponse.Data.Length"); i++) {
			CustomList customList = new CustomList();
			customList.setStatus(_ctx.stringValue("QueryOfficialFileCustomListResponse.Data["+ i +"].Status"));
			customList.setExpireTime(_ctx.longValue("QueryOfficialFileCustomListResponse.Data["+ i +"].ExpireTime"));
			customList.setRemark(_ctx.stringValue("QueryOfficialFileCustomListResponse.Data["+ i +"].Remark"));
			customList.setDownloadUrl(_ctx.stringValue("QueryOfficialFileCustomListResponse.Data["+ i +"].DownloadUrl"));
			customList.setCreateTime(_ctx.longValue("QueryOfficialFileCustomListResponse.Data["+ i +"].CreateTime"));
			customList.setEndAcceptTime(_ctx.longValue("QueryOfficialFileCustomListResponse.Data["+ i +"].EndAcceptTime"));
			customList.setStartAcceptTime(_ctx.longValue("QueryOfficialFileCustomListResponse.Data["+ i +"].StartAcceptTime"));

			data.add(customList);
		}
		queryOfficialFileCustomListResponse.setData(data);
	 
	 	return queryOfficialFileCustomListResponse;
	}
}