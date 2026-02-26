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

import com.aliyuncs.brinekingdom.model.v20190627.GetPlanListResponse;
import com.aliyuncs.brinekingdom.model.v20190627.GetPlanListResponse.Result;
import com.aliyuncs.brinekingdom.model.v20190627.GetPlanListResponse.Result.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPlanListResponseUnmarshaller {

	public static GetPlanListResponse unmarshall(GetPlanListResponse getPlanListResponse, UnmarshallerContext _ctx) {
		
		getPlanListResponse.setRequestId(_ctx.stringValue("GetPlanListResponse.RequestId"));
		getPlanListResponse.setErrorMessage(_ctx.stringValue("GetPlanListResponse.ErrorMessage"));
		getPlanListResponse.setSuccess(_ctx.booleanValue("GetPlanListResponse.Success"));
		getPlanListResponse.setResultCode(_ctx.stringValue("GetPlanListResponse.ResultCode"));

		Result result = new Result();
		result.setCurrentPage(_ctx.longValue("GetPlanListResponse.Result.CurrentPage"));
		result.setPageCount(_ctx.longValue("GetPlanListResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("GetPlanListResponse.Result.PageSize"));
		result.setTotalCount(_ctx.longValue("GetPlanListResponse.Result.TotalCount"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPlanListResponse.Result.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setAccessory(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Accessory"));
			dataListItem.setAgreement(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Agreement"));
			dataListItem.setAllocateAmount(_ctx.integerValue("GetPlanListResponse.Result.DataList["+ i +"].AllocateAmount"));
			dataListItem.setAppGroupId(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].AppGroupId"));
			dataListItem.setAppGroupName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].AppGroupName"));
			dataListItem.setApplyType(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].ApplyType"));
			dataListItem.setAssetReceiver(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].AssetReceiver"));
			dataListItem.setAssetReceiverNick(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].AssetReceiverNick"));
			dataListItem.setAutoLading(_ctx.integerValue("GetPlanListResponse.Result.DataList["+ i +"].AutoLading"));
			dataListItem.setAzone(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Azone"));
			dataListItem.setBenefitOld(_ctx.integerValue("GetPlanListResponse.Result.DataList["+ i +"].BenefitOld"));
			dataListItem.setBenefitOldName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].BenefitOldName"));
			dataListItem.setBusiness(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Business"));
			dataListItem.setBusinessEnName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].BusinessEnName"));
			dataListItem.setBusinessMode(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].BusinessMode"));
			dataListItem.setBusinessModeName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].BusinessModeName"));
			dataListItem.setBusinessName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].BusinessName"));
			dataListItem.setCbmDemander(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].CbmDemander"));
			dataListItem.setChangeMsg(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].ChangeMsg"));
			dataListItem.setChangeSuccess(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].ChangeSuccess"));
			dataListItem.setChannelName1(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].ChannelName1"));
			dataListItem.setChannelName2(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].ChannelName2"));
			dataListItem.setClassZoneCode(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].ClassZoneCode"));
			dataListItem.setClassZoneName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].ClassZoneName"));
			dataListItem.setCloudDeployProduct1(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].CloudDeployProduct1"));
			dataListItem.setCloudDeployProduct1Name(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].CloudDeployProduct1Name"));
			dataListItem.setCloudDeployProduct2(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].CloudDeployProduct2"));
			dataListItem.setCloudDeployProduct2Name(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].CloudDeployProduct2Name"));
			dataListItem.setCloudDeployProduct3(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].CloudDeployProduct3"));
			dataListItem.setCloudDeployProduct3Name(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].CloudDeployProduct3Name"));
			dataListItem.setCmC(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].CmC"));
			dataListItem.setCmP(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].CmP"));
			dataListItem.setCmU(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].CmU"));
			dataListItem.setCmV(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].CmV"));
			dataListItem.setCnt(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].Cnt"));
			dataListItem.setCntString(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].CntString"));
			dataListItem.setComment(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Comment"));
			dataListItem.setCountry(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Country"));
			dataListItem.setCreateTime(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].CreateTime"));
			dataListItem.setCreator(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Creator"));
			dataListItem.setCreatorNic(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].CreatorNic"));
			dataListItem.setDeliveryAmount(_ctx.integerValue("GetPlanListResponse.Result.DataList["+ i +"].DeliveryAmount"));
			dataListItem.setEffectStatus(_ctx.integerValue("GetPlanListResponse.Result.DataList["+ i +"].EffectStatus"));
			dataListItem.setExpireDate(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].ExpireDate"));
			dataListItem.setId(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].Id"));
			dataListItem.setInstall(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].Install"));
			dataListItem.setInstallId(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].InstallId"));
			dataListItem.setInstallName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].InstallName"));
			dataListItem.setInstallStr(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].InstallStr"));
			dataListItem.setLadingQuantity(_ctx.integerValue("GetPlanListResponse.Result.DataList["+ i +"].LadingQuantity"));
			dataListItem.setLadingStatus(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].LadingStatus"));
			dataListItem.setLineNumber(_ctx.integerValue("GetPlanListResponse.Result.DataList["+ i +"].LineNumber"));
			dataListItem.setLogicZoneCode(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].LogicZoneCode"));
			dataListItem.setLogicZoneName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].LogicZoneName"));
			dataListItem.setMachineType(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].MachineType"));
			dataListItem.setManufacturerBrand(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].ManufacturerBrand"));
			dataListItem.setManufacturerBrandName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].ManufacturerBrandName"));
			dataListItem.setModelLoad(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].ModelLoad"));
			dataListItem.setModelLoadString(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].ModelLoadString"));
			dataListItem.setModify(_ctx.booleanValue("GetPlanListResponse.Result.DataList["+ i +"].Modify"));
			dataListItem.setMsg(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Msg"));
			dataListItem.setNakedDelivery(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].NakedDelivery"));
			dataListItem.setNakedDeliveryName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].NakedDeliveryName"));
			dataListItem.setNetArch(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].NetArch"));
			dataListItem.setNic(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Nic"));
			dataListItem.setOldCnt(_ctx.integerValue("GetPlanListResponse.Result.DataList["+ i +"].OldCnt"));
			dataListItem.setOrderId(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].OrderId"));
			dataListItem.setOrgKey(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].OrgKey"));
			dataListItem.setOriginId(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].OriginId"));
			dataListItem.setOsId(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].OsId"));
			dataListItem.setOsName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].OsName"));
			dataListItem.setOutId(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].OutId"));
			dataListItem.setWaitPickAmount(_ctx.integerValue("GetPlanListResponse.Result.DataList["+ i +"].WaitPickAmount"));
			dataListItem.setPickAmount(_ctx.integerValue("GetPlanListResponse.Result.DataList["+ i +"].PickAmount"));
			dataListItem.setDcosPickAmount(_ctx.integerValue("GetPlanListResponse.Result.DataList["+ i +"].DcosPickAmount"));
			dataListItem.setPickOrderId(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].PickOrderId"));
			dataListItem.setPlanType(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].PlanType"));
			dataListItem.setPriority(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Priority"));
			dataListItem.setProcessId(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].ProcessId"));
			dataListItem.setProduct1(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Product1"));
			dataListItem.setProduct1Name(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Product1Name"));
			dataListItem.setProduct2(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Product2"));
			dataListItem.setProduct2Name(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Product2Name"));
			dataListItem.setProduct3(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Product3"));
			dataListItem.setProduct3EnName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Product3EnName"));
			dataListItem.setProduct3Name(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Product3Name"));
			dataListItem.setProjectCode(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].ProjectCode"));
			dataListItem.setProjectName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].ProjectName"));
			dataListItem.setProjectType(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].ProjectType"));
			dataListItem.setProjectTypeName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].ProjectTypeName"));
			dataListItem.setQuotaPlanId(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].QuotaPlanId"));
			dataListItem.setRegion(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Region"));
			dataListItem.setReportId(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].ReportId"));
			dataListItem.setRequireType(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].RequireType"));
			dataListItem.setRequireTypeName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].RequireTypeName"));
			dataListItem.setRoomCode(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].RoomCode"));
			dataListItem.setSafeYear(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].SafeYear"));
			dataListItem.setSafeZoneCode(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].SafeZoneCode"));
			dataListItem.setSafeZoneName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].SafeZoneName"));
			dataListItem.setScenario(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Scenario"));
			dataListItem.setSource(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Source"));
			dataListItem.setStatus(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].Status"));
			dataListItem.setStatusName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].StatusName"));
			dataListItem.setSubordinateIndustryLine(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].SubordinateIndustryLine"));
			dataListItem.setSubordinateIndustryLineName(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].SubordinateIndustryLineName"));
			dataListItem.setSuccess(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].Success"));
			dataListItem.setTime(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].Time"));
			dataListItem.setTimeSpan(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].TimeSpan"));
			dataListItem.setTimeString(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].TimeString"));
			dataListItem.setUpdateTime(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].UpdateTime"));
			dataListItem.setUpdater(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].Updater"));
			dataListItem.setUpdaterNic(_ctx.stringValue("GetPlanListResponse.Result.DataList["+ i +"].UpdaterNic"));
			dataListItem.setVersion(_ctx.longValue("GetPlanListResponse.Result.DataList["+ i +"].Version"));

			dataList.add(dataListItem);
		}
		result.setDataList(dataList);
		getPlanListResponse.setResult(result);
	 
	 	return getPlanListResponse;
	}
}