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

package com.aliyuncs.brinekingdom.transform.v20190627;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brinekingdom.model.v20190627.GetPlanListWithReverseResponse;
import com.aliyuncs.brinekingdom.model.v20190627.GetPlanListWithReverseResponse.Result;
import com.aliyuncs.brinekingdom.model.v20190627.GetPlanListWithReverseResponse.Result.DataListItem;
import com.aliyuncs.brinekingdom.model.v20190627.GetPlanListWithReverseResponse.Result.DataListItem.SplitDataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPlanListWithReverseResponseUnmarshaller {

	public static GetPlanListWithReverseResponse unmarshall(GetPlanListWithReverseResponse getPlanListWithReverseResponse, UnmarshallerContext _ctx) {
		
		getPlanListWithReverseResponse.setRequestId(_ctx.stringValue("GetPlanListWithReverseResponse.RequestId"));
		getPlanListWithReverseResponse.setErrorMessage(_ctx.stringValue("GetPlanListWithReverseResponse.ErrorMessage"));
		getPlanListWithReverseResponse.setSuccess(_ctx.booleanValue("GetPlanListWithReverseResponse.Success"));
		getPlanListWithReverseResponse.setResultCode(_ctx.stringValue("GetPlanListWithReverseResponse.ResultCode"));

		Result result = new Result();
		result.setCurrentPage(_ctx.longValue("GetPlanListWithReverseResponse.Result.CurrentPage"));
		result.setPageCount(_ctx.longValue("GetPlanListWithReverseResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("GetPlanListWithReverseResponse.Result.PageSize"));
		result.setTotalCount(_ctx.longValue("GetPlanListWithReverseResponse.Result.TotalCount"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPlanListWithReverseResponse.Result.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setAgreement(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Agreement"));
			dataListItem.setAppGroupId(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].AppGroupId"));
			dataListItem.setAppGroupName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].AppGroupName"));
			dataListItem.setAssetReceiver(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].AssetReceiver"));
			dataListItem.setAssetReceiverNick(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].AssetReceiverNick"));
			dataListItem.setAzone(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Azone"));
			dataListItem.setBenefitOld(_ctx.integerValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].BenefitOld"));
			dataListItem.setBusiness(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Business"));
			dataListItem.setBusinessMode(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].BusinessMode"));
			dataListItem.setBusinessModeName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].BusinessModeName"));
			dataListItem.setBusinessName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].BusinessName"));
			dataListItem.setCbmDemander(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].CbmDemander"));
			dataListItem.setClassZoneCode(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].ClassZoneCode"));
			dataListItem.setClassZoneName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].ClassZoneName"));
			dataListItem.setCloudDeployProduct1Name(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].CloudDeployProduct1Name"));
			dataListItem.setCloudDeployProduct2Name(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].CloudDeployProduct2Name"));
			dataListItem.setCloudDeployProduct3(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].CloudDeployProduct3"));
			dataListItem.setCloudDeployProduct3Name(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].CloudDeployProduct3Name"));
			dataListItem.setCmC(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].CmC"));
			dataListItem.setCmP(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].CmP"));
			dataListItem.setCmU(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].CmU"));
			dataListItem.setCmV(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].CmV"));
			dataListItem.setCnt(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Cnt"));
			dataListItem.setComment(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Comment"));
			dataListItem.setCreator(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Creator"));
			dataListItem.setCreatorNic(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].CreatorNic"));
			dataListItem.setDeliveryAmount(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].DeliveryAmount"));
			dataListItem.setExpireDate(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].ExpireDate"));
			dataListItem.setHighCnt(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].HighCnt"));
			dataListItem.setId(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Id"));
			dataListItem.setInstall(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Install"));
			dataListItem.setInstallId(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].InstallId"));
			dataListItem.setInstallName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].InstallName"));
			dataListItem.setLadingStatus(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].LadingStatus"));
			dataListItem.setLogicZoneCode(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].LogicZoneCode"));
			dataListItem.setLogicZoneName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].LogicZoneName"));
			dataListItem.setMachineType(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].MachineType"));
			dataListItem.setManufacturerBrand(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].ManufacturerBrand"));
			dataListItem.setManufacturerBrandName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].ManufacturerBrandName"));
			dataListItem.setModelLoad(_ctx.integerValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].ModelLoad"));
			dataListItem.setMsg(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Msg"));
			dataListItem.setNakedDelivery(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].NakedDelivery"));
			dataListItem.setNetArch(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].NetArch"));
			dataListItem.setNic(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Nic"));
			dataListItem.setOrgKey(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].OrgKey"));
			dataListItem.setOsId(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].OsId"));
			dataListItem.setOsName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].OsName"));
			dataListItem.setOutId(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].OutId"));
			dataListItem.setPickAmount(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].PickAmount"));
			dataListItem.setPlanType(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].PlanType"));
			dataListItem.setPriority(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Priority"));
			dataListItem.setProcessId(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].ProcessId"));
			dataListItem.setProduct1(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Product1"));
			dataListItem.setProduct1Name(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Product1Name"));
			dataListItem.setProduct2(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Product2"));
			dataListItem.setProduct2Name(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Product2Name"));
			dataListItem.setProduct3(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Product3"));
			dataListItem.setProduct3Name(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Product3Name"));
			dataListItem.setProjectCode(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].ProjectCode"));
			dataListItem.setProjectName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].ProjectName"));
			dataListItem.setProjectType(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].ProjectType"));
			dataListItem.setProjectTypeName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].ProjectTypeName"));
			dataListItem.setQuotaPlanId(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].QuotaPlanId"));
			dataListItem.setRegion(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Region"));
			dataListItem.setRequireType(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].RequireType"));
			dataListItem.setRequireTypeName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].RequireTypeName"));
			dataListItem.setRoomCode(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].RoomCode"));
			dataListItem.setSafeYear(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SafeYear"));
			dataListItem.setSafeZoneCode(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SafeZoneCode"));
			dataListItem.setSafeZoneName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SafeZoneName"));
			dataListItem.setScenario(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Scenario"));
			dataListItem.setSource(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Source"));
			dataListItem.setStatus(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Status"));
			dataListItem.setSubLine(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SubLine"));
			dataListItem.setSubLineName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SubLineName"));
			dataListItem.setSuccess(_ctx.integerValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Success"));
			dataListItem.setTime(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].Time"));

			List<SplitDataListItem> splitDataList = new ArrayList<SplitDataListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList.Length"); j++) {
				SplitDataListItem splitDataListItem = new SplitDataListItem();
				splitDataListItem.setAddStatus(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].AddStatus"));
				splitDataListItem.setAppGroupId(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].AppGroupId"));
				splitDataListItem.setAppGroupName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].AppGroupName"));
				splitDataListItem.setAssetReceiver(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].AssetReceiver"));
				splitDataListItem.setAssetReceiverNick(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].AssetReceiverNick"));
				splitDataListItem.setAzone(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Azone"));
				splitDataListItem.setBenefitOld(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].BenefitOld"));
				splitDataListItem.setBusiness(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Business"));
				splitDataListItem.setBusinessMode(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].BusinessMode"));
				splitDataListItem.setBusinessModeName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].BusinessModeName"));
				splitDataListItem.setBusinessName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].BusinessName"));
				splitDataListItem.setCbmDemander(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].CbmDemander"));
				splitDataListItem.setClassZoneCode(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].ClassZoneCode"));
				splitDataListItem.setClassZoneName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].ClassZoneName"));
				splitDataListItem.setCloudDeployProduct1Name(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].CloudDeployProduct1Name"));
				splitDataListItem.setCloudDeployProduct2Name(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].CloudDeployProduct2Name"));
				splitDataListItem.setCloudDeployProduct3(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].CloudDeployProduct3"));
				splitDataListItem.setCloudDeployProduct3Name(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].CloudDeployProduct3Name"));
				splitDataListItem.setCmC(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].CmC"));
				splitDataListItem.setCmP(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].CmP"));
				splitDataListItem.setCmU(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].CmU"));
				splitDataListItem.setCmV(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].CmV"));
				splitDataListItem.setCnt(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Cnt"));
				splitDataListItem.setComment(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Comment"));
				splitDataListItem.setCountry(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Country"));
				splitDataListItem.setCreator(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Creator"));
				splitDataListItem.setCreatorNic(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].CreatorNic"));
				splitDataListItem.setDcosStatus(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].DcosStatus"));
				splitDataListItem.setDemandStatus(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].DemandStatus"));
				splitDataListItem.setError(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Error"));
				splitDataListItem.setGmtCreate(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].GmtCreate"));
				splitDataListItem.setGmtModified(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].GmtModified"));
				splitDataListItem.setHighCnt(_ctx.integerValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].HighCnt"));
				splitDataListItem.setId(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Id"));
				splitDataListItem.setInstall(_ctx.integerValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Install"));
				splitDataListItem.setInstallId(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].InstallId"));
				splitDataListItem.setInstallName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].InstallName"));
				splitDataListItem.setLadingStatus(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].LadingStatus"));
				splitDataListItem.setLogicZoneCode(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].LogicZoneCode"));
				splitDataListItem.setLogicZoneName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].LogicZoneName"));
				splitDataListItem.setMachineType(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].MachineType"));
				splitDataListItem.setManufacturerBrand(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].ManufacturerBrand"));
				splitDataListItem.setManufacturerBrandName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].ManufacturerBrandName"));
				splitDataListItem.setModelLoad(_ctx.integerValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].ModelLoad"));
				splitDataListItem.setNakedDelivery(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].NakedDelivery"));
				splitDataListItem.setNetArch(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].NetArch"));
				splitDataListItem.setNewPlanId(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].NewPlanId"));
				splitDataListItem.setNic(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Nic"));
				splitDataListItem.setOrg(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Org"));
				splitDataListItem.setOriginId(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].OriginId"));
				splitDataListItem.setOsId(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].OsId"));
				splitDataListItem.setOsName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].OsName"));
				splitDataListItem.setOutId(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].OutId"));
				splitDataListItem.setPlanChangeReason(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].PlanChangeReason"));
				splitDataListItem.setPlanType(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].PlanType"));
				splitDataListItem.setPriority(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Priority"));
				splitDataListItem.setProcessId(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].ProcessId"));
				splitDataListItem.setProduct1(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Product1"));
				splitDataListItem.setProduct1Name(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Product1Name"));
				splitDataListItem.setProduct2(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Product2"));
				splitDataListItem.setProduct2Name(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Product2Name"));
				splitDataListItem.setProduct3(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Product3"));
				splitDataListItem.setProduct3Name(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Product3Name"));
				splitDataListItem.setProjectCode(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].ProjectCode"));
				splitDataListItem.setProjectName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].ProjectName"));
				splitDataListItem.setProjectType(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].ProjectType"));
				splitDataListItem.setProjectTypeName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].ProjectTypeName"));
				splitDataListItem.setQuotaPlanId(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].QuotaPlanId"));
				splitDataListItem.setRegion(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Region"));
				splitDataListItem.setRequireType(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].RequireType"));
				splitDataListItem.setRequireTypeName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].RequireTypeName"));
				splitDataListItem.setReverseStatus(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].ReverseStatus"));
				splitDataListItem.setReverseType(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].ReverseType"));
				splitDataListItem.setRoomCode(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].RoomCode"));
				splitDataListItem.setSafeYear(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].SafeYear"));
				splitDataListItem.setSafeZoneCode(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].SafeZoneCode"));
				splitDataListItem.setSafeZoneName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].SafeZoneName"));
				splitDataListItem.setScStatus(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].ScStatus"));
				splitDataListItem.setScenario(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Scenario"));
				splitDataListItem.setStockStatus(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].StockStatus"));
				splitDataListItem.setSubLine(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].SubLine"));
				splitDataListItem.setSubLineName(_ctx.stringValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].SubLineName"));
				splitDataListItem.setTime(_ctx.longValue("GetPlanListWithReverseResponse.Result.DataList["+ i +"].SplitDataList["+ j +"].Time"));

				splitDataList.add(splitDataListItem);
			}
			dataListItem.setSplitDataList(splitDataList);

			dataList.add(dataListItem);
		}
		result.setDataList(dataList);
		getPlanListWithReverseResponse.setResult(result);
	 
	 	return getPlanListWithReverseResponse;
	}
}