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

import com.aliyuncs.cdrs.model.v20201101.ListDevicePersonResponse;
import com.aliyuncs.cdrs.model.v20201101.ListDevicePersonResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevicePersonResponseUnmarshaller {

	public static ListDevicePersonResponse unmarshall(ListDevicePersonResponse listDevicePersonResponse, UnmarshallerContext _ctx) {
		
		listDevicePersonResponse.setRequestId(_ctx.stringValue("ListDevicePersonResponse.RequestId"));
		listDevicePersonResponse.setCode(_ctx.stringValue("ListDevicePersonResponse.Code"));
		listDevicePersonResponse.setMessage(_ctx.stringValue("ListDevicePersonResponse.Message"));
		listDevicePersonResponse.setPageNumber(_ctx.longValue("ListDevicePersonResponse.PageNumber"));
		listDevicePersonResponse.setPageSize(_ctx.longValue("ListDevicePersonResponse.PageSize"));
		listDevicePersonResponse.setTotalCount(_ctx.longValue("ListDevicePersonResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListDevicePersonResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setPersonId(_ctx.stringValue("ListDevicePersonResponse.Data["+ i +"].PersonId"));
			datas.setDataSourceId(_ctx.stringValue("ListDevicePersonResponse.Data["+ i +"].DataSourceId"));
			datas.setGender(_ctx.stringValue("ListDevicePersonResponse.Data["+ i +"].Gender"));
			datas.setFreqNum(_ctx.stringValue("ListDevicePersonResponse.Data["+ i +"].FreqNum"));
			datas.setTargetPicUrlPath(_ctx.stringValue("ListDevicePersonResponse.Data["+ i +"].TargetPicUrlPath"));

			data.add(datas);
		}
		listDevicePersonResponse.setData(data);
	 
	 	return listDevicePersonResponse;
	}
}