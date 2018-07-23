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

package com.aliyuncs.zhuque.transform.v20160701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.zhuque.model.v20160701.QueryZhuqueSummaryResponse;
import com.aliyuncs.zhuque.model.v20160701.QueryZhuqueSummaryResponse.ControllerItem;
import com.aliyuncs.zhuque.model.v20160701.QueryZhuqueSummaryResponse.ControllerItem.PublicList;
import com.aliyuncs.zhuque.model.v20160701.QueryZhuqueSummaryResponse.ControllerItem.PublicList.ControllerSpecificationItem;
import com.aliyuncs.zhuque.model.v20160701.QueryZhuqueSummaryResponse.IdcItem;
import com.aliyuncs.zhuque.model.v20160701.QueryZhuqueSummaryResponse.IdcItem.ControllerItemOfIdc;
import com.aliyuncs.zhuque.model.v20160701.QueryZhuqueSummaryResponse.IdcItem.ControllerItemOfIdc.MachineTypeCountItemOfController;
import com.aliyuncs.zhuque.model.v20160701.QueryZhuqueSummaryResponse.IdcItem.NetworkDeviceItem;
import com.aliyuncs.zhuque.model.v20160701.QueryZhuqueSummaryResponse.IdcItem.NetworkDeviceItem.SubModel;
import com.aliyuncs.zhuque.model.v20160701.QueryZhuqueSummaryResponse.IdcItem.SummaryItem;
import com.aliyuncs.zhuque.model.v20160701.QueryZhuqueSummaryResponse.IdcItem.SummaryItem.MachineTypeCountItemOfCommodity;
import com.aliyuncs.zhuque.model.v20160701.QueryZhuqueSummaryResponse.IdcItem.SummaryItem.SpecificationItem;
import com.aliyuncs.zhuque.model.v20160701.QueryZhuqueSummaryResponse.IdcItem.SummaryItem.SpecificationItem.MachineTypeCountItemOfModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryZhuqueSummaryResponseUnmarshaller {

	public static QueryZhuqueSummaryResponse unmarshall(QueryZhuqueSummaryResponse queryZhuqueSummaryResponse, UnmarshallerContext context) {
		
		queryZhuqueSummaryResponse.setRequestId(context.stringValue("QueryZhuqueSummaryResponse.RequestId"));
		queryZhuqueSummaryResponse.setCloudInstanceId(context.stringValue("QueryZhuqueSummaryResponse.CloudInstanceId"));
		queryZhuqueSummaryResponse.setCloudInstanceName(context.stringValue("QueryZhuqueSummaryResponse.CloudInstanceName"));
		queryZhuqueSummaryResponse.setPropertyMode(context.stringValue("QueryZhuqueSummaryResponse.PropertyMode"));
		queryZhuqueSummaryResponse.setVersionStatus(context.stringValue("QueryZhuqueSummaryResponse.VersionStatus"));

		ControllerItem controllerItem = new ControllerItem();
		controllerItem.setCloudInstanceId(context.stringValue("QueryZhuqueSummaryResponse.ControllerItem.CloudInstanceId"));
		controllerItem.setControllerCode(context.stringValue("QueryZhuqueSummaryResponse.ControllerItem.ControllerCode"));

		PublicList publicList = new PublicList();
		publicList.setNcCount(context.integerValue("QueryZhuqueSummaryResponse.ControllerItem.PublicList.NcCount"));

		List<ControllerSpecificationItem> controllerSpecificationItemList = new ArrayList<ControllerSpecificationItem>();
		for (int i = 0; i < context.lengthValue("QueryZhuqueSummaryResponse.ControllerItem.PublicList.ControllerSpecificationItemList.Length"); i++) {
			ControllerSpecificationItem controllerSpecificationItem = new ControllerSpecificationItem();
			controllerSpecificationItem.setSpecificationCode(context.stringValue("QueryZhuqueSummaryResponse.ControllerItem.PublicList.ControllerSpecificationItemList["+ i +"].SpecificationCode"));
			controllerSpecificationItem.setSpecificationCount(context.integerValue("QueryZhuqueSummaryResponse.ControllerItem.PublicList.ControllerSpecificationItemList["+ i +"].SpecificationCount"));
			controllerSpecificationItem.setSpecificationUnit(context.stringValue("QueryZhuqueSummaryResponse.ControllerItem.PublicList.ControllerSpecificationItemList["+ i +"].SpecificationUnit"));

			controllerSpecificationItemList.add(controllerSpecificationItem);
		}
		publicList.setControllerSpecificationItemList(controllerSpecificationItemList);
		controllerItem.setPublicList(publicList);
		queryZhuqueSummaryResponse.setControllerItem(controllerItem);

		List<IdcItem> idcList = new ArrayList<IdcItem>();
		for (int i = 0; i < context.lengthValue("QueryZhuqueSummaryResponse.IdcList.Length"); i++) {
			IdcItem idcItem = new IdcItem();
			idcItem.setIdcId(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].IdcId"));
			idcItem.setNcCount(context.integerValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NcCount"));

			ControllerItemOfIdc controllerItemOfIdc = new ControllerItemOfIdc();
			controllerItemOfIdc.setCommodityCode(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].ControllerItemOfIdc.CommodityCode"));
			controllerItemOfIdc.setNcCount(context.integerValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].ControllerItemOfIdc.NcCount"));

			List<MachineTypeCountItemOfController> ncCountByMachineTypeOfController = new ArrayList<MachineTypeCountItemOfController>();
			for (int j = 0; j < context.lengthValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].ControllerItemOfIdc.NcCountByMachineTypeOfController.Length"); j++) {
				MachineTypeCountItemOfController machineTypeCountItemOfController = new MachineTypeCountItemOfController();
				machineTypeCountItemOfController.setMachineType(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].ControllerItemOfIdc.NcCountByMachineTypeOfController["+ j +"].MachineType"));
				machineTypeCountItemOfController.setMachineTypeCode(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].ControllerItemOfIdc.NcCountByMachineTypeOfController["+ j +"].MachineTypeCode"));
				machineTypeCountItemOfController.setCount(context.integerValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].ControllerItemOfIdc.NcCountByMachineTypeOfController["+ j +"].Count"));

				ncCountByMachineTypeOfController.add(machineTypeCountItemOfController);
			}
			controllerItemOfIdc.setNcCountByMachineTypeOfController(ncCountByMachineTypeOfController);
			idcItem.setControllerItemOfIdc(controllerItemOfIdc);

			List<SummaryItem> summaryItemList = new ArrayList<SummaryItem>();
			for (int j = 0; j < context.lengthValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList.Length"); j++) {
				SummaryItem summaryItem = new SummaryItem();
				summaryItem.setCommodityCode(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].CommodityCode"));
				summaryItem.setNcCount(context.integerValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].NcCount"));

				List<MachineTypeCountItemOfCommodity> ncCountByMachineTypeOfCommodity = new ArrayList<MachineTypeCountItemOfCommodity>();
				for (int k = 0; k < context.lengthValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].NcCountByMachineTypeOfCommodity.Length"); k++) {
					MachineTypeCountItemOfCommodity machineTypeCountItemOfCommodity = new MachineTypeCountItemOfCommodity();
					machineTypeCountItemOfCommodity.setMachineType(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].NcCountByMachineTypeOfCommodity["+ k +"].MachineType"));
					machineTypeCountItemOfCommodity.setMachineTypeCode(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].NcCountByMachineTypeOfCommodity["+ k +"].MachineTypeCode"));
					machineTypeCountItemOfCommodity.setCount(context.integerValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].NcCountByMachineTypeOfCommodity["+ k +"].Count"));

					ncCountByMachineTypeOfCommodity.add(machineTypeCountItemOfCommodity);
				}
				summaryItem.setNcCountByMachineTypeOfCommodity(ncCountByMachineTypeOfCommodity);

				List<SpecificationItem> specificationItemList = new ArrayList<SpecificationItem>();
				for (int k = 0; k < context.lengthValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].SpecificationItemList.Length"); k++) {
					SpecificationItem specificationItem = new SpecificationItem();
					specificationItem.setSpecificationCode(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].SpecificationItemList["+ k +"].SpecificationCode"));
					specificationItem.setSpecificationCount(context.integerValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].SpecificationItemList["+ k +"].SpecificationCount"));
					specificationItem.setSpecificationUnit(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].SpecificationItemList["+ k +"].SpecificationUnit"));
					specificationItem.setNcCount(context.integerValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].SpecificationItemList["+ k +"].NcCount"));

					List<MachineTypeCountItemOfModule> ncCountByMachineTypeOfModule = new ArrayList<MachineTypeCountItemOfModule>();
					for (int l = 0; l < context.lengthValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].SpecificationItemList["+ k +"].NcCountByMachineTypeOfModule.Length"); l++) {
						MachineTypeCountItemOfModule machineTypeCountItemOfModule = new MachineTypeCountItemOfModule();
						machineTypeCountItemOfModule.setMachineType(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].SpecificationItemList["+ k +"].NcCountByMachineTypeOfModule["+ l +"].MachineType"));
						machineTypeCountItemOfModule.setMachineTypeCode(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].SpecificationItemList["+ k +"].NcCountByMachineTypeOfModule["+ l +"].MachineTypeCode"));
						machineTypeCountItemOfModule.setCount(context.integerValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].SummaryItemList["+ j +"].SpecificationItemList["+ k +"].NcCountByMachineTypeOfModule["+ l +"].Count"));

						ncCountByMachineTypeOfModule.add(machineTypeCountItemOfModule);
					}
					specificationItem.setNcCountByMachineTypeOfModule(ncCountByMachineTypeOfModule);

					specificationItemList.add(specificationItem);
				}
				summaryItem.setSpecificationItemList(specificationItemList);

				summaryItemList.add(summaryItem);
			}
			idcItem.setSummaryItemList(summaryItemList);

			List<NetworkDeviceItem> networkDeviceItemList = new ArrayList<NetworkDeviceItem>();
			for (int j = 0; j < context.lengthValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList.Length"); j++) {
				NetworkDeviceItem networkDeviceItem = new NetworkDeviceItem();
				networkDeviceItem.setCommodityCode(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList["+ j +"].CommodityCode"));
				networkDeviceItem.setRole(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList["+ j +"].Role"));
				networkDeviceItem.setDisplayName(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList["+ j +"].DisplayName"));
				networkDeviceItem.setCount(context.integerValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList["+ j +"].Count"));
				networkDeviceItem.setManufacturer(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList["+ j +"].Manufacturer"));
				networkDeviceItem.setModel(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList["+ j +"].Model"));
				networkDeviceItem.setPurchasePackId(context.integerValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList["+ j +"].PurchasePackId"));

				List<SubModel> subModelList = new ArrayList<SubModel>();
				for (int k = 0; k < context.lengthValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList["+ j +"].SubModelList.Length"); k++) {
					SubModel subModel = new SubModel();
					subModel.setSpecificationCode(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList["+ j +"].SubModelList["+ k +"].SpecificationCode"));
					subModel.setDisplayName(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList["+ j +"].SubModelList["+ k +"].DisplayName"));
					subModel.setCount(context.integerValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList["+ j +"].SubModelList["+ k +"].Count"));
					subModel.setManufacturer(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList["+ j +"].SubModelList["+ k +"].Manufacturer"));
					subModel.setModel(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList["+ j +"].SubModelList["+ k +"].Model"));
					subModel.setNote(context.stringValue("QueryZhuqueSummaryResponse.IdcList["+ i +"].NetworkDeviceItemList["+ j +"].SubModelList["+ k +"].Note"));

					subModelList.add(subModel);
				}
				networkDeviceItem.setSubModelList(subModelList);

				networkDeviceItemList.add(networkDeviceItem);
			}
			idcItem.setNetworkDeviceItemList(networkDeviceItemList);

			idcList.add(idcItem);
		}
		queryZhuqueSummaryResponse.setIdcList(idcList);
	 
	 	return queryZhuqueSummaryResponse;
	}
}