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

import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobDetailResponse;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobDetailResponse.DataInitializationDetail;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobDetailResponse.DataSynchronizationDetail;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobDetailResponse.StructureInitializationDetail;
import com.aliyuncs.dts.model.v20180801.DescribeMigrationJobDetailResponse.StructureInitializationDetail.StructureInitializationDetail1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMigrationJobDetailResponseUnmarshaller {

	public static DescribeMigrationJobDetailResponse unmarshall(DescribeMigrationJobDetailResponse describeMigrationJobDetailResponse, UnmarshallerContext context) {
		
		describeMigrationJobDetailResponse.setPageNumber(context.integerValue("DescribeMigrationJobDetailResponse.PageNumber"));
		describeMigrationJobDetailResponse.setTotalRecordCount(context.longValue("DescribeMigrationJobDetailResponse.TotalRecordCount"));
		describeMigrationJobDetailResponse.setPageRecordCount(context.integerValue("DescribeMigrationJobDetailResponse.PageRecordCount"));

		List<StructureInitializationDetail> structureInitializationDetailList = new ArrayList<StructureInitializationDetail>();
		for (int i = 0; i < context.lengthValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList.Length"); i++) {
			StructureInitializationDetail structureInitializationDetail = new StructureInitializationDetail();
			structureInitializationDetail.setObjectName(context.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ObjectName"));
			structureInitializationDetail.setObjectType(context.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ObjectType"));
			structureInitializationDetail.setSourceOwnerDBName(context.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].SourceOwnerDBName"));
			structureInitializationDetail.setDestinationOwnerDBName(context.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].DestinationOwnerDBName"));
			structureInitializationDetail.setStatus(context.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].Status"));
			structureInitializationDetail.setErrorMessage(context.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ErrorMessage"));
			structureInitializationDetail.setObjectDefinition(context.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ObjectDefinition"));

			List<StructureInitializationDetail1> constraintList = new ArrayList<StructureInitializationDetail1>();
			for (int j = 0; j < context.lengthValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList.Length"); j++) {
				StructureInitializationDetail1 structureInitializationDetail1 = new StructureInitializationDetail1();
				structureInitializationDetail1.setObjectName(context.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].ObjectName"));
				structureInitializationDetail1.setObjectType(context.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].ObjectType"));
				structureInitializationDetail1.setSourceOwnerDBName(context.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].SourceOwnerDBName"));
				structureInitializationDetail1.setDestinationOwnerDBName(context.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].DestinationOwnerDBName"));
				structureInitializationDetail1.setStatus(context.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].Status"));
				structureInitializationDetail1.setErrorMessage(context.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].ErrorMessage"));
				structureInitializationDetail1.setObjectDefinition(context.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].ObjectDefinition"));

				constraintList.add(structureInitializationDetail1);
			}
			structureInitializationDetail.setConstraintList(constraintList);

			structureInitializationDetailList.add(structureInitializationDetail);
		}
		describeMigrationJobDetailResponse.setStructureInitializationDetailList(structureInitializationDetailList);

		List<DataInitializationDetail> dataInitializationDetailList = new ArrayList<DataInitializationDetail>();
		for (int i = 0; i < context.lengthValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList.Length"); i++) {
			DataInitializationDetail dataInitializationDetail = new DataInitializationDetail();
			dataInitializationDetail.setTableName(context.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].TableName"));
			dataInitializationDetail.setSourceOwnerDBName(context.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].SourceOwnerDBName"));
			dataInitializationDetail.setDestinationOwnerDBName(context.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].DestinationOwnerDBName"));
			dataInitializationDetail.setStatus(context.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].Status"));
			dataInitializationDetail.setErrorMessage(context.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].ErrorMessage"));
			dataInitializationDetail.setTotalRowNum(context.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].TotalRowNum"));
			dataInitializationDetail.setFinishRowNum(context.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].FinishRowNum"));
			dataInitializationDetail.setMigrationTime(context.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].MigrationTime"));

			dataInitializationDetailList.add(dataInitializationDetail);
		}
		describeMigrationJobDetailResponse.setDataInitializationDetailList(dataInitializationDetailList);

		List<DataSynchronizationDetail> dataSynchronizationDetailList = new ArrayList<DataSynchronizationDetail>();
		for (int i = 0; i < context.lengthValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList.Length"); i++) {
			DataSynchronizationDetail dataSynchronizationDetail = new DataSynchronizationDetail();
			dataSynchronizationDetail.setTableName(context.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].TableName"));
			dataSynchronizationDetail.setSourceOwnerDBName(context.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].SourceOwnerDBName"));
			dataSynchronizationDetail.setDestinationOwnerDBName(context.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].DestinationOwnerDBName"));
			dataSynchronizationDetail.setStatus(context.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].Status"));
			dataSynchronizationDetail.setErrorMessage(context.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].ErrorMessage"));

			dataSynchronizationDetailList.add(dataSynchronizationDetail);
		}
		describeMigrationJobDetailResponse.setDataSynchronizationDetailList(dataSynchronizationDetailList);
	 
	 	return describeMigrationJobDetailResponse;
	}
}