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

import com.aliyuncs.brinekingdom.model.v20190627.GetPlanByIdResponse;
import com.aliyuncs.brinekingdom.model.v20190627.GetPlanByIdResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPlanByIdResponseUnmarshaller {

	public static GetPlanByIdResponse unmarshall(GetPlanByIdResponse getPlanByIdResponse, UnmarshallerContext _ctx) {
		
		getPlanByIdResponse.setRequestId(_ctx.stringValue("GetPlanByIdResponse.RequestId"));
		getPlanByIdResponse.setErrorMessage(_ctx.stringValue("GetPlanByIdResponse.ErrorMessage"));
		getPlanByIdResponse.setSuccess(_ctx.booleanValue("GetPlanByIdResponse.Success"));
		getPlanByIdResponse.setResultCode(_ctx.stringValue("GetPlanByIdResponse.ResultCode"));

		Result result = new Result();
		result.setAgreement(_ctx.stringValue("GetPlanByIdResponse.Result.Agreement"));
		result.setAllocateAmount(_ctx.integerValue("GetPlanByIdResponse.Result.AllocateAmount"));
		result.setAppGroupId(_ctx.longValue("GetPlanByIdResponse.Result.AppGroupId"));
		result.setAppGroupName(_ctx.stringValue("GetPlanByIdResponse.Result.AppGroupName"));
		result.setApplyType(_ctx.longValue("GetPlanByIdResponse.Result.ApplyType"));
		result.setAssetReceiver(_ctx.stringValue("GetPlanByIdResponse.Result.AssetReceiver"));
		result.setAssetReceiverNick(_ctx.stringValue("GetPlanByIdResponse.Result.AssetReceiverNick"));
		result.setAutoLading(_ctx.longValue("GetPlanByIdResponse.Result.AutoLading"));
		result.setAzone(_ctx.stringValue("GetPlanByIdResponse.Result.Azone"));
		result.setBenefitOld(_ctx.integerValue("GetPlanByIdResponse.Result.BenefitOld"));
		result.setBusiness(_ctx.stringValue("GetPlanByIdResponse.Result.Business"));
		result.setBusinessEnName(_ctx.stringValue("GetPlanByIdResponse.Result.BusinessEnName"));
		result.setBusinessMode(_ctx.stringValue("GetPlanByIdResponse.Result.BusinessMode"));
		result.setBusinessModeName(_ctx.stringValue("GetPlanByIdResponse.Result.BusinessModeName"));
		result.setBusinessName(_ctx.stringValue("GetPlanByIdResponse.Result.BusinessName"));
		result.setCbmDemander(_ctx.stringValue("GetPlanByIdResponse.Result.CbmDemander"));
		result.setChangeMsg(_ctx.stringValue("GetPlanByIdResponse.Result.ChangeMsg"));
		result.setChangeSuccess(_ctx.longValue("GetPlanByIdResponse.Result.ChangeSuccess"));
		result.set_Class(_ctx.stringValue("GetPlanByIdResponse.Result.Class"));
		result.setClassZoneCode(_ctx.stringValue("GetPlanByIdResponse.Result.ClassZoneCode"));
		result.setClassZoneName(_ctx.stringValue("GetPlanByIdResponse.Result.ClassZoneName"));
		result.setCloudDeployProduct1(_ctx.stringValue("GetPlanByIdResponse.Result.CloudDeployProduct1"));
		result.setCloudDeployProduct1Name(_ctx.stringValue("GetPlanByIdResponse.Result.CloudDeployProduct1Name"));
		result.setCloudDeployProduct2(_ctx.stringValue("GetPlanByIdResponse.Result.CloudDeployProduct2"));
		result.setCloudDeployProduct2Name(_ctx.stringValue("GetPlanByIdResponse.Result.CloudDeployProduct2Name"));
		result.setCloudDeployProduct3(_ctx.stringValue("GetPlanByIdResponse.Result.CloudDeployProduct3"));
		result.setCloudDeployProduct3Name(_ctx.stringValue("GetPlanByIdResponse.Result.CloudDeployProduct3Name"));
		result.setCmC(_ctx.stringValue("GetPlanByIdResponse.Result.CmC"));
		result.setCmP(_ctx.stringValue("GetPlanByIdResponse.Result.CmP"));
		result.setCmU(_ctx.stringValue("GetPlanByIdResponse.Result.CmU"));
		result.setCmV(_ctx.stringValue("GetPlanByIdResponse.Result.CmV"));
		result.setCnt(_ctx.longValue("GetPlanByIdResponse.Result.Cnt"));
		result.setCntString(_ctx.stringValue("GetPlanByIdResponse.Result.CntString"));
		result.setComment(_ctx.stringValue("GetPlanByIdResponse.Result.Comment"));
		result.setCountry(_ctx.stringValue("GetPlanByIdResponse.Result.Country"));
		result.setCreateTime(_ctx.longValue("GetPlanByIdResponse.Result.CreateTime"));
		result.setCreator(_ctx.stringValue("GetPlanByIdResponse.Result.Creator"));
		result.setCreatorNic(_ctx.stringValue("GetPlanByIdResponse.Result.CreatorNic"));
		result.setDeliveryAmount(_ctx.integerValue("GetPlanByIdResponse.Result.DeliveryAmount"));
		result.setEffectStatus(_ctx.integerValue("GetPlanByIdResponse.Result.EffectStatus"));
		result.setExpireDate(_ctx.longValue("GetPlanByIdResponse.Result.ExpireDate"));
		result.setId(_ctx.longValue("GetPlanByIdResponse.Result.Id"));
		result.setInstall(_ctx.longValue("GetPlanByIdResponse.Result.Install"));
		result.setInstallId(_ctx.longValue("GetPlanByIdResponse.Result.InstallId"));
		result.setInstallName(_ctx.stringValue("GetPlanByIdResponse.Result.InstallName"));
		result.setLadingQuantity(_ctx.integerValue("GetPlanByIdResponse.Result.LadingQuantity"));
		result.setLadingStatus(_ctx.longValue("GetPlanByIdResponse.Result.LadingStatus"));
		result.setLineNumber(_ctx.integerValue("GetPlanByIdResponse.Result.LineNumber"));
		result.setLogicZoneCode(_ctx.stringValue("GetPlanByIdResponse.Result.LogicZoneCode"));
		result.setLogicZoneName(_ctx.stringValue("GetPlanByIdResponse.Result.LogicZoneName"));
		result.setMachineType(_ctx.stringValue("GetPlanByIdResponse.Result.MachineType"));
		result.setManufacturerBrand(_ctx.longValue("GetPlanByIdResponse.Result.ManufacturerBrand"));
		result.setManufacturerBrandName(_ctx.stringValue("GetPlanByIdResponse.Result.ManufacturerBrandName"));
		result.setModelLoad(_ctx.longValue("GetPlanByIdResponse.Result.ModelLoad"));
		result.setModelLoadString(_ctx.stringValue("GetPlanByIdResponse.Result.ModelLoadString"));
		result.setModify(_ctx.booleanValue("GetPlanByIdResponse.Result.Modify"));
		result.setMsg(_ctx.stringValue("GetPlanByIdResponse.Result.Msg"));
		result.setNakedDelivery(_ctx.longValue("GetPlanByIdResponse.Result.NakedDelivery"));
		result.setNakedDeliveryName(_ctx.stringValue("GetPlanByIdResponse.Result.NakedDeliveryName"));
		result.setNetArch(_ctx.stringValue("GetPlanByIdResponse.Result.NetArch"));
		result.setNic(_ctx.stringValue("GetPlanByIdResponse.Result.Nic"));
		result.setOldCnt(_ctx.integerValue("GetPlanByIdResponse.Result.OldCnt"));
		result.setOrderId(_ctx.longValue("GetPlanByIdResponse.Result.OrderId"));
		result.setOrgKey(_ctx.stringValue("GetPlanByIdResponse.Result.OrgKey"));
		result.setOriginId(_ctx.longValue("GetPlanByIdResponse.Result.OriginId"));
		result.setOsId(_ctx.longValue("GetPlanByIdResponse.Result.OsId"));
		result.setOsName(_ctx.stringValue("GetPlanByIdResponse.Result.OsName"));
		result.setOutId(_ctx.stringValue("GetPlanByIdResponse.Result.OutId"));
		result.setPickAmount(_ctx.integerValue("GetPlanByIdResponse.Result.PickAmount"));
		result.setPickOrderId(_ctx.longValue("GetPlanByIdResponse.Result.PickOrderId"));
		result.setPlanType(_ctx.longValue("GetPlanByIdResponse.Result.PlanType"));
		result.setPriority(_ctx.stringValue("GetPlanByIdResponse.Result.Priority"));
		result.setProcessId(_ctx.stringValue("GetPlanByIdResponse.Result.ProcessId"));
		result.setProduct1(_ctx.stringValue("GetPlanByIdResponse.Result.Product1"));
		result.setProduct1Name(_ctx.stringValue("GetPlanByIdResponse.Result.Product1Name"));
		result.setProduct2(_ctx.stringValue("GetPlanByIdResponse.Result.Product2"));
		result.setProduct2Name(_ctx.stringValue("GetPlanByIdResponse.Result.Product2Name"));
		result.setProduct3(_ctx.stringValue("GetPlanByIdResponse.Result.Product3"));
		result.setProduct3EnName(_ctx.stringValue("GetPlanByIdResponse.Result.Product3EnName"));
		result.setProduct3Name(_ctx.stringValue("GetPlanByIdResponse.Result.Product3Name"));
		result.setProjectCode(_ctx.stringValue("GetPlanByIdResponse.Result.ProjectCode"));
		result.setProjectName(_ctx.stringValue("GetPlanByIdResponse.Result.ProjectName"));
		result.setProjectType(_ctx.stringValue("GetPlanByIdResponse.Result.ProjectType"));
		result.setProjectTypeName(_ctx.stringValue("GetPlanByIdResponse.Result.ProjectTypeName"));
		result.setQuotaPlanId(_ctx.longValue("GetPlanByIdResponse.Result.QuotaPlanId"));
		result.setRegion(_ctx.stringValue("GetPlanByIdResponse.Result.Region"));
		result.setReportId(_ctx.stringValue("GetPlanByIdResponse.Result.ReportId"));
		result.setRequireType(_ctx.stringValue("GetPlanByIdResponse.Result.RequireType"));
		result.setRequireTypeName(_ctx.stringValue("GetPlanByIdResponse.Result.RequireTypeName"));
		result.setRoomCode(_ctx.stringValue("GetPlanByIdResponse.Result.RoomCode"));
		result.setSafeYear(_ctx.stringValue("GetPlanByIdResponse.Result.SafeYear"));
		result.setSafeZoneCode(_ctx.stringValue("GetPlanByIdResponse.Result.SafeZoneCode"));
		result.setSafeZoneName(_ctx.stringValue("GetPlanByIdResponse.Result.SafeZoneName"));
		result.setScenario(_ctx.stringValue("GetPlanByIdResponse.Result.Scenario"));
		result.setSource(_ctx.stringValue("GetPlanByIdResponse.Result.Source"));
		result.setStatus(_ctx.longValue("GetPlanByIdResponse.Result.Status"));
		result.setStatusName(_ctx.stringValue("GetPlanByIdResponse.Result.StatusName"));
		result.setSubordinateIndustryLine(_ctx.stringValue("GetPlanByIdResponse.Result.SubordinateIndustryLine"));
		result.setSubordinateIndustryLineName(_ctx.stringValue("GetPlanByIdResponse.Result.SubordinateIndustryLineName"));
		result.setSuccess(_ctx.longValue("GetPlanByIdResponse.Result.Success"));
		result.setTime(_ctx.longValue("GetPlanByIdResponse.Result.Time"));
		result.setTimeSpan(_ctx.longValue("GetPlanByIdResponse.Result.TimeSpan"));
		result.setTimeString(_ctx.stringValue("GetPlanByIdResponse.Result.TimeString"));
		result.setUpdateTime(_ctx.longValue("GetPlanByIdResponse.Result.UpdateTime"));
		result.setUpdater(_ctx.stringValue("GetPlanByIdResponse.Result.Updater"));
		result.setUpdaterNic(_ctx.stringValue("GetPlanByIdResponse.Result.UpdaterNic"));
		result.setVersion(_ctx.longValue("GetPlanByIdResponse.Result.Version"));
		getPlanByIdResponse.setResult(result);
	 
	 	return getPlanByIdResponse;
	}
}