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

package com.aliyuncs.dts.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20180801.DescribeInitializationStatusResponse;
import com.aliyuncs.dts.model.v20180801.DescribeInitializationStatusResponse.DataInitializationDetail;
import com.aliyuncs.dts.model.v20180801.DescribeInitializationStatusResponse.DataSynchronizationDetail;
import com.aliyuncs.dts.model.v20180801.DescribeInitializationStatusResponse.StructureInitializationDetail;
import com.aliyuncs.dts.model.v20180801.DescribeInitializationStatusResponse.StructureInitializationDetail.StructureInitializationDetail1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInitializationStatusResponseUnmarshaller {

	public static DescribeInitializationStatusResponse unmarshall(DescribeInitializationStatusResponse describeInitializationStatusResponse, UnmarshallerContext _ctx) {
		

		List<StructureInitializationDetail> structureInitializationDetails = new ArrayList<StructureInitializationDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInitializationStatusResponse.StructureInitializationDetails.Length"); i++) {
			StructureInitializationDetail structureInitializationDetail = new StructureInitializationDetail();
			structureInitializationDetail.setObjectName(_ctx.stringValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].ObjectName"));
			structureInitializationDetail.setObjectType(_ctx.stringValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].ObjectType"));
			structureInitializationDetail.setSourceOwnerDBName(_ctx.stringValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].SourceOwnerDBName"));
			structureInitializationDetail.setDestinationOwnerDBName(_ctx.stringValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].DestinationOwnerDBName"));
			structureInitializationDetail.setStatus(_ctx.stringValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].Status"));
			structureInitializationDetail.setErrorMessage(_ctx.stringValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].ErrorMessage"));
			structureInitializationDetail.setObjectDefinition(_ctx.stringValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].ObjectDefinition"));

			List<StructureInitializationDetail1> constraints = new ArrayList<StructureInitializationDetail1>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].Constraints.Length"); j++) {
				StructureInitializationDetail1 structureInitializationDetail1 = new StructureInitializationDetail1();
				structureInitializationDetail1.setObjectName(_ctx.stringValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].Constraints["+ j +"].ObjectName"));
				structureInitializationDetail1.setObjectType(_ctx.stringValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].Constraints["+ j +"].ObjectType"));
				structureInitializationDetail1.setSourceOwnerDBName(_ctx.stringValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].Constraints["+ j +"].SourceOwnerDBName"));
				structureInitializationDetail1.setDestinationOwnerDBName(_ctx.stringValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].Constraints["+ j +"].DestinationOwnerDBName"));
				structureInitializationDetail1.setStatus(_ctx.stringValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].Constraints["+ j +"].Status"));
				structureInitializationDetail1.setErrorMessage(_ctx.stringValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].Constraints["+ j +"].ErrorMessage"));
				structureInitializationDetail1.setObjectDefinition(_ctx.stringValue("DescribeInitializationStatusResponse.StructureInitializationDetails["+ i +"].Constraints["+ j +"].ObjectDefinition"));

				constraints.add(structureInitializationDetail1);
			}
			structureInitializationDetail.setConstraints(constraints);

			structureInitializationDetails.add(structureInitializationDetail);
		}
		describeInitializationStatusResponse.setStructureInitializationDetails(structureInitializationDetails);

		List<DataInitializationDetail> dataInitializationDetails = new ArrayList<DataInitializationDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInitializationStatusResponse.DataInitializationDetails.Length"); i++) {
			DataInitializationDetail dataInitializationDetail = new DataInitializationDetail();
			dataInitializationDetail.setTableName(_ctx.stringValue("DescribeInitializationStatusResponse.DataInitializationDetails["+ i +"].TableName"));
			dataInitializationDetail.setSourceOwnerDBName(_ctx.stringValue("DescribeInitializationStatusResponse.DataInitializationDetails["+ i +"].SourceOwnerDBName"));
			dataInitializationDetail.setDestinationOwnerDBName(_ctx.stringValue("DescribeInitializationStatusResponse.DataInitializationDetails["+ i +"].DestinationOwnerDBName"));
			dataInitializationDetail.setStatus(_ctx.stringValue("DescribeInitializationStatusResponse.DataInitializationDetails["+ i +"].Status"));
			dataInitializationDetail.setErrorMessage(_ctx.stringValue("DescribeInitializationStatusResponse.DataInitializationDetails["+ i +"].ErrorMessage"));
			dataInitializationDetail.setTotalRowNum(_ctx.stringValue("DescribeInitializationStatusResponse.DataInitializationDetails["+ i +"].TotalRowNum"));
			dataInitializationDetail.setFinishRowNum(_ctx.stringValue("DescribeInitializationStatusResponse.DataInitializationDetails["+ i +"].FinishRowNum"));
			dataInitializationDetail.setUsedTime(_ctx.stringValue("DescribeInitializationStatusResponse.DataInitializationDetails["+ i +"].UsedTime"));

			dataInitializationDetails.add(dataInitializationDetail);
		}
		describeInitializationStatusResponse.setDataInitializationDetails(dataInitializationDetails);

		List<DataSynchronizationDetail> dataSynchronizationDetails = new ArrayList<DataSynchronizationDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInitializationStatusResponse.DataSynchronizationDetails.Length"); i++) {
			DataSynchronizationDetail dataSynchronizationDetail = new DataSynchronizationDetail();
			dataSynchronizationDetail.setTableName(_ctx.stringValue("DescribeInitializationStatusResponse.DataSynchronizationDetails["+ i +"].TableName"));
			dataSynchronizationDetail.setSourceOwnerDBName(_ctx.stringValue("DescribeInitializationStatusResponse.DataSynchronizationDetails["+ i +"].SourceOwnerDBName"));
			dataSynchronizationDetail.setDestinationOwnerDBName(_ctx.stringValue("DescribeInitializationStatusResponse.DataSynchronizationDetails["+ i +"].DestinationOwnerDBName"));
			dataSynchronizationDetail.setStatus(_ctx.stringValue("DescribeInitializationStatusResponse.DataSynchronizationDetails["+ i +"].Status"));
			dataSynchronizationDetail.setErrorMessage(_ctx.stringValue("DescribeInitializationStatusResponse.DataSynchronizationDetails["+ i +"].ErrorMessage"));

			dataSynchronizationDetails.add(dataSynchronizationDetail);
		}
		describeInitializationStatusResponse.setDataSynchronizationDetails(dataSynchronizationDetails);
	 
	 	return describeInitializationStatusResponse;
	}
}