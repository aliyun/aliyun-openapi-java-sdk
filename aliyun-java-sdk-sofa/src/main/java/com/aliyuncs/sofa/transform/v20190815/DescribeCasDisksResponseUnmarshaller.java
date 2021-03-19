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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.DescribeCasDisksResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeCasDisksResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.DescribeCasDisksResponse.DataItem.Computer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasDisksResponseUnmarshaller {

	public static DescribeCasDisksResponse unmarshall(DescribeCasDisksResponse describeCasDisksResponse, UnmarshallerContext _ctx) {
		
		describeCasDisksResponse.setRequestId(_ctx.stringValue("DescribeCasDisksResponse.RequestId"));
		describeCasDisksResponse.setResultCode(_ctx.stringValue("DescribeCasDisksResponse.ResultCode"));
		describeCasDisksResponse.setResultMessage(_ctx.stringValue("DescribeCasDisksResponse.ResultMessage"));
		describeCasDisksResponse.setTotalCount(_ctx.longValue("DescribeCasDisksResponse.TotalCount"));
		describeCasDisksResponse.setPageSize(_ctx.longValue("DescribeCasDisksResponse.PageSize"));
		describeCasDisksResponse.setCurrentPage(_ctx.longValue("DescribeCasDisksResponse.CurrentPage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasDisksResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCategory(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].Category"));
			dataItem.setDeleteAutoSnapshot(_ctx.booleanValue("DescribeCasDisksResponse.Data["+ i +"].DeleteAutoSnapshot"));
			dataItem.setDeleteWithComputer(_ctx.booleanValue("DescribeCasDisksResponse.Data["+ i +"].DeleteWithComputer"));
			dataItem.setDevice(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].Device"));
			dataItem.setEnableAutoSnapshot(_ctx.booleanValue("DescribeCasDisksResponse.Data["+ i +"].EnableAutoSnapshot"));
			dataItem.setIaasId(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].IaasId"));
			dataItem.setId(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].Id"));
			dataItem.setImageId(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].ImageId"));
			dataItem.setName(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].Name"));
			dataItem.setPortable(_ctx.booleanValue("DescribeCasDisksResponse.Data["+ i +"].Portable"));
			dataItem.setProviderId(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].ProviderId"));
			dataItem.setRegionId(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].RegionId"));
			dataItem.setSize(_ctx.longValue("DescribeCasDisksResponse.Data["+ i +"].Size"));
			dataItem.setStatus(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].Status"));
			dataItem.setTenantId(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].TenantId"));
			dataItem.setType(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].Type"));
			dataItem.setUtcCreate(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].UtcModified"));
			dataItem.setWorkspaceId(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].WorkspaceId"));
			dataItem.setZoneId(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].ZoneId"));

			Computer computer = new Computer();
			computer.setName(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].Computer.Name"));
			computer.setId(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].Computer.Id"));
			computer.setIaasId(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].Computer.IaasId"));
			computer.setStatus(_ctx.stringValue("DescribeCasDisksResponse.Data["+ i +"].Computer.Status"));
			dataItem.setComputer(computer);

			data.add(dataItem);
		}
		describeCasDisksResponse.setData(data);
	 
	 	return describeCasDisksResponse;
	}
}