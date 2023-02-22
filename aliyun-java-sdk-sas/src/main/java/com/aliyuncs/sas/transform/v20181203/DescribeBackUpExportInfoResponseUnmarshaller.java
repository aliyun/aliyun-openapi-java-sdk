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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeBackUpExportInfoResponse;
import com.aliyuncs.sas.model.v20181203.DescribeBackUpExportInfoResponse.DataItem;
import com.aliyuncs.sas.model.v20181203.DescribeBackUpExportInfoResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackUpExportInfoResponseUnmarshaller {

	public static DescribeBackUpExportInfoResponse unmarshall(DescribeBackUpExportInfoResponse describeBackUpExportInfoResponse, UnmarshallerContext _ctx) {
		
		describeBackUpExportInfoResponse.setRequestId(_ctx.stringValue("DescribeBackUpExportInfoResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeBackUpExportInfoResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeBackUpExportInfoResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeBackUpExportInfoResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeBackUpExportInfoResponse.PageInfo.Count"));
		describeBackUpExportInfoResponse.setPageInfo(pageInfo);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackUpExportInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setLink(_ctx.stringValue("DescribeBackUpExportInfoResponse.Data["+ i +"].Link"));
			dataItem.setStatus(_ctx.stringValue("DescribeBackUpExportInfoResponse.Data["+ i +"].Status"));
			dataItem.setProgress(_ctx.integerValue("DescribeBackUpExportInfoResponse.Data["+ i +"].Progress"));
			dataItem.setCurrentCount(_ctx.integerValue("DescribeBackUpExportInfoResponse.Data["+ i +"].CurrentCount"));
			dataItem.setGmtCreate(_ctx.longValue("DescribeBackUpExportInfoResponse.Data["+ i +"].GmtCreate"));
			dataItem.setMessage(_ctx.stringValue("DescribeBackUpExportInfoResponse.Data["+ i +"].Message"));
			dataItem.setFileName(_ctx.stringValue("DescribeBackUpExportInfoResponse.Data["+ i +"].FileName"));
			dataItem.setTotalCount(_ctx.integerValue("DescribeBackUpExportInfoResponse.Data["+ i +"].TotalCount"));
			dataItem.setId(_ctx.longValue("DescribeBackUpExportInfoResponse.Data["+ i +"].Id"));

			data.add(dataItem);
		}
		describeBackUpExportInfoResponse.setData(data);
	 
	 	return describeBackUpExportInfoResponse;
	}
}