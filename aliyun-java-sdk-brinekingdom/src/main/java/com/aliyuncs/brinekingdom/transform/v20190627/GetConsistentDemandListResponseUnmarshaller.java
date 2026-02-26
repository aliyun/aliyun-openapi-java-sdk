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

import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandDeploy;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.ComboValue;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.ComboValue.ServerDemandListItem;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.ComboValue.WholeRackListItem;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.ComboValue.WholeRackListItem.ServerDemandListItem6;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.ExchangeValue;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.ExchangeValue.ServerDemandListItem11;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.NetPackValue;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.NetPackValue.ItemListItem;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.PubNetAccessValue;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.PubNetAccessValue.ItemListItem2;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.RackValue;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.RackValue.ItemListItem9;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.ServerDTO;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.ServiceValue;
import com.aliyuncs.brinekingdom.model.v20190627.GetConsistentDemandListResponse.ResultItem.DemandItem.ServiceValue.ItemListItem4;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConsistentDemandListResponseUnmarshaller {

	public static GetConsistentDemandListResponse unmarshall(GetConsistentDemandListResponse getConsistentDemandListResponse, UnmarshallerContext _ctx) {
		
		getConsistentDemandListResponse.setRequestId(_ctx.stringValue("GetConsistentDemandListResponse.RequestId"));
		getConsistentDemandListResponse.setMessage(_ctx.stringValue("GetConsistentDemandListResponse.Message"));
		getConsistentDemandListResponse.setSuccess(_ctx.booleanValue("GetConsistentDemandListResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetConsistentDemandListResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAscriptionClassName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].AscriptionClassName"));
			resultItem.setDeployProduct2Name(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DeployProduct2Name"));
			resultItem.setItemType(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ItemType"));
			resultItem.setMatchCnt(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].MatchCnt"));
			resultItem.setOrgName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].OrgName"));
			resultItem.setBusinessMode(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].BusinessMode"));
			resultItem.setBrandName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].BrandName"));
			resultItem.setItem(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Item"));
			resultItem.setFactoryInstall(_ctx.booleanValue("GetConsistentDemandListResponse.Result["+ i +"].FactoryInstall"));
			resultItem.setRequireType(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].RequireType"));
			resultItem.setModelLoad(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].ModelLoad"));
			resultItem.setServerAssignCnt(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].ServerAssignCnt"));
			resultItem.setOsId(_ctx.longValue("GetConsistentDemandListResponse.Result["+ i +"].OsId"));
			resultItem.setLadingProcessQty(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].LadingProcessQty"));
			resultItem.setProjectTypeName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ProjectTypeName"));
			resultItem.setStatus(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Status"));
			resultItem.setCbmOwner(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].CbmOwner"));
			resultItem.setProductType(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ProductType"));
			resultItem.setProduct3Name(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Product3Name"));
			resultItem.setScenario(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Scenario"));
			resultItem.setNetworkArch(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].NetworkArch"));
			resultItem.setUid(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Uid"));
			resultItem.setGmtCreate(_ctx.longValue("GetConsistentDemandListResponse.Result["+ i +"].GmtCreate"));
			resultItem.setScPlanIds(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ScPlanIds"));
			resultItem.setSupplyQty(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].SupplyQty"));
			resultItem.setId(_ctx.longValue("GetConsistentDemandListResponse.Result["+ i +"].Id"));
			resultItem.setAssetReceiverNick(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].AssetReceiverNick"));
			resultItem.setUseCapacityCnt(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].UseCapacityCnt"));
			resultItem.setProduct3(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Product3"));
			resultItem.setProduct1(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Product1"));
			resultItem.setProjectName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ProjectName"));
			resultItem.setProduct2(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Product2"));
			resultItem.setSourceId(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].SourceId"));
			resultItem.setProduct1Name(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Product1Name"));
			resultItem.setMoveExecuteQty(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].MoveExecuteQty"));
			resultItem.setUseL2PoolCnt(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].UseL2PoolCnt"));
			resultItem.setAscriptionClass(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].AscriptionClass"));
			resultItem.setExpectTurnOverDateStr(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ExpectTurnOverDateStr"));
			resultItem.setDeployProduct1(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DeployProduct1"));
			resultItem.setDeployProduct3(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DeployProduct3"));
			resultItem.setDeployProduct2(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DeployProduct2"));
			resultItem.setMoveQty(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].MoveQty"));
			resultItem.setLogicZone(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].LogicZone"));
			resultItem.setSupplyArea(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].SupplyArea"));
			resultItem.setManufacturingBrandCode(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ManufacturingBrandCode"));
			resultItem.setExecuteFlag(_ctx.booleanValue("GetConsistentDemandListResponse.Result["+ i +"].ExecuteFlag"));
			resultItem.setDemandClass(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandClass"));
			resultItem.setMoveDeliveredQty(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].MoveDeliveredQty"));
			resultItem.setTenantId(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].TenantId"));
			resultItem.setDeployProduct3Name(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DeployProduct3Name"));
			resultItem.setModel(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Model"));
			resultItem.setOtherMsg(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].OtherMsg"));
			resultItem.setTag(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Tag"));
			resultItem.setAutoExecute(_ctx.booleanValue("GetConsistentDemandListResponse.Result["+ i +"].AutoExecute"));
			resultItem.setDemandQty(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].DemandQty"));
			resultItem.setBusinessType(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].BusinessType"));
			resultItem.setIdc(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Idc"));
			resultItem.setBrandCode(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].BrandCode"));
			resultItem.setCreator(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Creator"));
			resultItem.setBrandId(_ctx.longValue("GetConsistentDemandListResponse.Result["+ i +"].BrandId"));
			resultItem.setInstallName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].InstallName"));
			resultItem.setEvaluateStatus(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].EvaluateStatus"));
			resultItem.setFcstOccupyStatus(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].FcstOccupyStatus"));
			resultItem.setCapacityResponseStatus(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].CapacityResponseStatus"));
			resultItem.setAblePurchaseLading(_ctx.booleanValue("GetConsistentDemandListResponse.Result["+ i +"].AblePurchaseLading"));
			resultItem.setManufacturingBrandId(_ctx.longValue("GetConsistentDemandListResponse.Result["+ i +"].ManufacturingBrandId"));
			resultItem.setSafeYear(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].SafeYear"));
			resultItem.setMoveOrders(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].MoveOrders"));
			resultItem.setSupplyLevel(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].SupplyLevel"));
			resultItem.setRequireTypeName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].RequireTypeName"));
			resultItem.setConfigModel(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ConfigModel"));
			resultItem.setUpdater(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Updater"));
			resultItem.setExpectTurnOverDate(_ctx.longValue("GetConsistentDemandListResponse.Result["+ i +"].ExpectTurnOverDate"));
			resultItem.setMoveReason(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].MoveReason"));
			resultItem.setSupplyType(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].SupplyType"));
			resultItem.setDeployProduct1Name(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DeployProduct1Name"));
			resultItem.setInstall(_ctx.booleanValue("GetConsistentDemandListResponse.Result["+ i +"].Install"));
			resultItem.setWhiteOrder(_ctx.booleanValue("GetConsistentDemandListResponse.Result["+ i +"].WhiteOrder"));
			resultItem.setUseSupplyCnt(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].UseSupplyCnt"));
			resultItem.setAzone(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Azone"));
			resultItem.setPurchaseCnt(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].PurchaseCnt"));
			resultItem.setShiftMethod(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ShiftMethod"));
			resultItem.setBenefitOld(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].BenefitOld"));
			resultItem.setIndustryLine(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].IndustryLine"));
			resultItem.setPurchaseOrders(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].PurchaseOrders"));
			resultItem.setFcstId(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].FcstId"));
			resultItem.setPriority(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Priority"));
			resultItem.setUsePlanCnt(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].UsePlanCnt"));
			resultItem.setRackAssignCnt(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].RackAssignCnt"));
			resultItem.setAssignVersion(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].AssignVersion"));
			resultItem.setFeatureStr(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].FeatureStr"));
			resultItem.setFlag(_ctx.booleanValue("GetConsistentDemandListResponse.Result["+ i +"].Flag"));
			resultItem.setExecuteError(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ExecuteError"));
			resultItem.setAssetReceiver(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].AssetReceiver"));
			resultItem.setUsePoolInPlaceCnt(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].UsePoolInPlaceCnt"));
			resultItem.setSectionRackStatus(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].SectionRackStatus"));
			resultItem.setProjectType(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ProjectType"));
			resultItem.setHasSolution(_ctx.booleanValue("GetConsistentDemandListResponse.Result["+ i +"].HasSolution"));
			resultItem.setRegion(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Region"));
			resultItem.setUseFcst(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].UseFcst"));
			resultItem.setCreatorName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].CreatorName"));
			resultItem.setOperator(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Operator"));
			resultItem.setBtoFlag(_ctx.booleanValue("GetConsistentDemandListResponse.Result["+ i +"].BtoFlag"));
			resultItem.setClassZone(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ClassZone"));
			resultItem.setOrg(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Org"));
			resultItem.setManualBrandName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ManualBrandName"));
			resultItem.setGmtModified(_ctx.longValue("GetConsistentDemandListResponse.Result["+ i +"].GmtModified"));
			resultItem.setClassZoneName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ClassZoneName"));
			resultItem.setSectionDetail(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].SectionDetail"));
			resultItem.setReplenishUnit(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ReplenishUnit"));
			resultItem.setSource(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Source"));
			resultItem.setProduct2Name(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Product2Name"));
			resultItem.setExecuteQty(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].ExecuteQty"));
			resultItem.setSupplyDeliveredQty(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].SupplyDeliveredQty"));
			resultItem.setFeatures(_ctx.mapValue("GetConsistentDemandListResponse.Result["+ i +"].Features"));
			resultItem.setProjectCode(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ProjectCode"));
			resultItem.setInstallId(_ctx.longValue("GetConsistentDemandListResponse.Result["+ i +"].InstallId"));
			resultItem.setSectionRackAssignCnt(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].SectionRackAssignCnt"));
			resultItem.setUsePoolMoveCnt(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].UsePoolMoveCnt"));
			resultItem.setAppGroup(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].AppGroup"));
			resultItem.setUpdaterName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].UpdaterName"));
			resultItem.setComments(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Comments"));
			resultItem.setUsePoolCnt(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].UsePoolCnt"));
			resultItem.setOsName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].OsName"));
			resultItem.setError(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Error"));
			resultItem.setNic(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Nic"));
			resultItem.setCluster(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].Cluster"));
			resultItem.setBusinessTypeName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].BusinessTypeName"));
			resultItem.setProcessId(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].ProcessId"));
			resultItem.setSafeZone(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].SafeZone"));
			resultItem.setToConfirmCnt(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].ToConfirmCnt"));

			List<String> rackInfo = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetConsistentDemandListResponse.Result["+ i +"].RackInfo.Length"); j++) {
				rackInfo.add(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].RackInfo["+ j +"]"));
			}
			resultItem.setRackInfo(rackInfo);

			DemandDeploy demandDeploy = new DemandDeploy();
			demandDeploy.setNetArch(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandDeploy.NetArch"));
			demandDeploy.setFrameworkClass(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandDeploy.FrameworkClass"));
			demandDeploy.setDeployMode(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandDeploy.DeployMode"));
			demandDeploy.setDeployLocation(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandDeploy.DeployLocation"));
			demandDeploy.setDeployArch(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandDeploy.DeployArch"));
			demandDeploy.setNodeType(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandDeploy.NodeType"));
			demandDeploy.setDeployLevel(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandDeploy.DeployLevel"));
			demandDeploy.setBoxModel(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandDeploy.BoxModel"));
			demandDeploy.setPublicNetWorkExport(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandDeploy.PublicNetWorkExport"));
			demandDeploy.setBoxUpLink(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandDeploy.BoxUpLink"));
			demandDeploy.setDeployRole(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandDeploy.DeployRole"));
			demandDeploy.setBoxDownLink(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandDeploy.BoxDownLink"));
			resultItem.setDemandDeploy(demandDeploy);

			DemandItem demandItem = new DemandItem();
			demandItem.setDemandItemType(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.DemandItemType"));

			ServerDTO serverDTO = new ServerDTO();
			serverDTO.setConfig(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ServerDTO.Config"));
			serverDTO.setModel(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ServerDTO.Model"));
			serverDTO.setNic(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ServerDTO.Nic"));
			demandItem.setServerDTO(serverDTO);

			NetPackValue netPackValue = new NetPackValue();

			List<ItemListItem> itemList = new ArrayList<ItemListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.NetPackValue.ItemList.Length"); j++) {
				ItemListItem itemListItem = new ItemListItem();
				itemListItem.setRole(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.NetPackValue.ItemList["+ j +"].Role"));
				itemListItem.setDemandQty(_ctx.longValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.NetPackValue.ItemList["+ j +"].DemandQty"));
				itemListItem.setResourceType(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.NetPackValue.ItemList["+ j +"].ResourceType"));
				itemListItem.setFramework(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.NetPackValue.ItemList["+ j +"].Framework"));
				itemListItem.setRemark(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.NetPackValue.ItemList["+ j +"].Remark"));

				itemList.add(itemListItem);
			}
			netPackValue.setItemList(itemList);
			demandItem.setNetPackValue(netPackValue);

			PubNetAccessValue pubNetAccessValue = new PubNetAccessValue();

			List<ItemListItem2> itemList1 = new ArrayList<ItemListItem2>();
			for (int j = 0; j < _ctx.lengthValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.PubNetAccessValue.ItemList.Length"); j++) {
				ItemListItem2 itemListItem2 = new ItemListItem2();
				itemListItem2.setPrice(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.PubNetAccessValue.ItemList["+ j +"].Price"));
				itemListItem2.setBandwidth(_ctx.floatValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.PubNetAccessValue.ItemList["+ j +"].Bandwidth"));
				itemListItem2.setAccessType(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.PubNetAccessValue.ItemList["+ j +"].AccessType"));

				itemList1.add(itemListItem2);
			}
			pubNetAccessValue.setItemList1(itemList1);
			demandItem.setPubNetAccessValue(pubNetAccessValue);

			ServiceValue serviceValue = new ServiceValue();

			List<ItemListItem4> itemList3 = new ArrayList<ItemListItem4>();
			for (int j = 0; j < _ctx.lengthValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList.Length"); j++) {
				ItemListItem4 itemListItem4 = new ItemListItem4();
				itemListItem4.setServiceTypeName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].ServiceTypeName"));
				itemListItem4.setArea(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].Area"));
				itemListItem4.setYear(_ctx.floatValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].Year"));
				itemListItem4.setServiceType(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].ServiceType"));
				itemListItem4.setAmount(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].Amount"));
				itemListItem4.setIdc(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].Idc"));
				itemListItem4.setServiceItemName(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].ServiceItemName"));
				itemListItem4.setCity(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].City"));
				itemListItem4.setServiceItem(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].ServiceItem"));
				itemListItem4.setRemark(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].Remark"));

				itemList3.add(itemListItem4);
			}
			serviceValue.setItemList3(itemList3);
			demandItem.setServiceValue(serviceValue);

			ComboValue comboValue = new ComboValue();
			comboValue.setSkuId(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.SkuId"));

			List<ServerDemandListItem> serverDemandList = new ArrayList<ServerDemandListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList.Length"); j++) {
				ServerDemandListItem serverDemandListItem = new ServerDemandListItem();
				serverDemandListItem.setItem(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].Item"));
				serverDemandListItem.setProduct3(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].Product3"));
				serverDemandListItem.setAgreedQuantity(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].AgreedQuantity"));
				serverDemandListItem.setQuantity(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].Quantity"));
				serverDemandListItem.setSkuId(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].SkuId"));
				serverDemandListItem.setAppGroup(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].AppGroup"));

				List<String> snList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].SnList.Length"); k++) {
					snList.add(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].SnList["+ k +"]"));
				}
				serverDemandListItem.setSnList(snList);

				serverDemandList.add(serverDemandListItem);
			}
			comboValue.setServerDemandList(serverDemandList);

			List<WholeRackListItem> wholeRackList = new ArrayList<WholeRackListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList.Length"); j++) {
				WholeRackListItem wholeRackListItem = new WholeRackListItem();
				wholeRackListItem.setOrder(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].Order"));
				wholeRackListItem.setRackPackage(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].RackPackage"));

				List<ServerDemandListItem6> serverDemandList5 = new ArrayList<ServerDemandListItem6>();
				for (int k = 0; k < _ctx.lengthValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList.Length"); k++) {
					ServerDemandListItem6 serverDemandListItem6 = new ServerDemandListItem6();
					serverDemandListItem6.setItem(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].Item"));
					serverDemandListItem6.setProduct3(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].Product3"));
					serverDemandListItem6.setAgreedQuantity(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].AgreedQuantity"));
					serverDemandListItem6.setQuantity(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].Quantity"));
					serverDemandListItem6.setSkuId(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].SkuId"));
					serverDemandListItem6.setAppGroup(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].AppGroup"));

					List<String> snList7 = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].SnList.Length"); l++) {
						snList7.add(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].SnList["+ l +"]"));
					}
					serverDemandListItem6.setSnList7(snList7);

					serverDemandList5.add(serverDemandListItem6);
				}
				wholeRackListItem.setServerDemandList5(serverDemandList5);

				wholeRackList.add(wholeRackListItem);
			}
			comboValue.setWholeRackList(wholeRackList);
			demandItem.setComboValue(comboValue);

			RackValue rackValue = new RackValue();

			List<ItemListItem9> itemList8 = new ArrayList<ItemListItem9>();
			for (int j = 0; j < _ctx.lengthValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.RackValue.ItemList.Length"); j++) {
				ItemListItem9 itemListItem9 = new ItemListItem9();
				itemListItem9.setRackNum(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.RackValue.ItemList["+ j +"].RackNum"));
				itemListItem9.setRoomCode(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.RackValue.ItemList["+ j +"].RoomCode"));
				itemListItem9.setPower(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.RackValue.ItemList["+ j +"].Power"));
				itemListItem9.setPowUtilizationRate(_ctx.floatValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.RackValue.ItemList["+ j +"].PowUtilizationRate"));

				itemList8.add(itemListItem9);
			}
			rackValue.setItemList8(itemList8);
			demandItem.setRackValue(rackValue);

			ExchangeValue exchangeValue = new ExchangeValue();

			List<String> exchangeList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ExchangeValue.ExchangeList.Length"); j++) {
				exchangeList.add(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ExchangeValue.ExchangeList["+ j +"]"));
			}
			exchangeValue.setExchangeList(exchangeList);

			List<ServerDemandListItem11> serverDemandList10 = new ArrayList<ServerDemandListItem11>();
			for (int j = 0; j < _ctx.lengthValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList.Length"); j++) {
				ServerDemandListItem11 serverDemandListItem11 = new ServerDemandListItem11();
				serverDemandListItem11.setItem(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].Item"));
				serverDemandListItem11.setProduct3(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].Product3"));
				serverDemandListItem11.setAgreedQuantity(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].AgreedQuantity"));
				serverDemandListItem11.setQuantity(_ctx.integerValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].Quantity"));
				serverDemandListItem11.setSkuId(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].SkuId"));
				serverDemandListItem11.setAppGroup(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].AppGroup"));

				List<String> snList12 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].SnList.Length"); k++) {
					snList12.add(_ctx.stringValue("GetConsistentDemandListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].SnList["+ k +"]"));
				}
				serverDemandListItem11.setSnList12(snList12);

				serverDemandList10.add(serverDemandListItem11);
			}
			exchangeValue.setServerDemandList10(serverDemandList10);
			demandItem.setExchangeValue(exchangeValue);
			resultItem.setDemandItem(demandItem);

			result.add(resultItem);
		}
		getConsistentDemandListResponse.setResult(result);
	 
	 	return getConsistentDemandListResponse;
	}
}