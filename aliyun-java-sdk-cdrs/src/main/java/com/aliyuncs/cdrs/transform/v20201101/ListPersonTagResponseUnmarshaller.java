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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.ListPersonTagResponse;
import com.aliyuncs.cdrs.model.v20201101.ListPersonTagResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersonTagResponseUnmarshaller {

	public static ListPersonTagResponse unmarshall(ListPersonTagResponse listPersonTagResponse, UnmarshallerContext _ctx) {
		
		listPersonTagResponse.setRequestId(_ctx.stringValue("ListPersonTagResponse.RequestId"));
		listPersonTagResponse.setCode(_ctx.stringValue("ListPersonTagResponse.Code"));
		listPersonTagResponse.setMessage(_ctx.stringValue("ListPersonTagResponse.Message"));
		listPersonTagResponse.setPageNumber(_ctx.longValue("ListPersonTagResponse.PageNumber"));
		listPersonTagResponse.setPageSize(_ctx.longValue("ListPersonTagResponse.PageSize"));
		listPersonTagResponse.setTotalCount(_ctx.longValue("ListPersonTagResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListPersonTagResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setCorpId(_ctx.stringValue("ListPersonTagResponse.Data["+ i +"].CorpId"));
			datas.setTagValue(_ctx.stringValue("ListPersonTagResponse.Data["+ i +"].TagValue"));
			datas.setValue(_ctx.stringValue("ListPersonTagResponse.Data["+ i +"].Value"));

			data.add(datas);
		}
		listPersonTagResponse.setData(data);
	 
	 	return listPersonTagResponse;
	}
}