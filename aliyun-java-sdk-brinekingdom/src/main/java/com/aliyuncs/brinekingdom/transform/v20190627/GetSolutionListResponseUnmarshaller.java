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

import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandDeploy;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.ComboValue;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.ComboValue.ServerDemandListItem;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.ComboValue.WholeRackListItem;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.ComboValue.WholeRackListItem.ServerDemandListItem6;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.ExchangeValue;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.ExchangeValue.ServerDemandListItem11;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.NetPackValue;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.NetPackValue.ItemListItem;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.PubNetAccessValue;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.PubNetAccessValue.ItemListItem2;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.RackValue;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.RackValue.ItemListItem9;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.ServerDTO;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.ServiceValue;
import com.aliyuncs.brinekingdom.model.v20190627.GetSolutionListResponse.ResultItem.DemandItem.ServiceValue.ItemListItem4;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSolutionListResponseUnmarshaller {

	public static GetSolutionListResponse unmarshall(GetSolutionListResponse getSolutionListResponse, UnmarshallerContext _ctx) {
		
		getSolutionListResponse.setRequestId(_ctx.stringValue("GetSolutionListResponse.RequestId"));
		getSolutionListResponse.setMessage(_ctx.stringValue("GetSolutionListResponse.Message"));
		getSolutionListResponse.setSuccess(_ctx.booleanValue("GetSolutionListResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSolutionListResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAscriptionClassName(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].AscriptionClassName"));
			resultItem.setDeployProduct2Name(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DeployProduct2Name"));
			resultItem.setDcsId(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].DcsId"));
			resultItem.setDataError(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DataError"));
			resultItem.setItemType(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ItemType"));
			resultItem.setUkUseId(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].UkUseId"));
			resultItem.setMatchCnt(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].MatchCnt"));
			resultItem.setOrgName(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].OrgName"));
			resultItem.setBusinessMode(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].BusinessMode"));
			resultItem.setBrandName(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].BrandName"));
			resultItem.setItem(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Item"));
			resultItem.setFactoryInstall(_ctx.booleanValue("GetSolutionListResponse.Result["+ i +"].FactoryInstall"));
			resultItem.setRequireType(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].RequireType"));
			resultItem.setModelLoad(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].ModelLoad"));
			resultItem.setServerAssignCnt(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].ServerAssignCnt"));
			resultItem.setOsId(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].OsId"));
			resultItem.setConsistentId(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].ConsistentId"));
			resultItem.setLadingProcessQty(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].LadingProcessQty"));
			resultItem.setQuotaPlanId(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].QuotaPlanId"));
			resultItem.setDeliveryType(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DeliveryType"));
			resultItem.setDataFlag(_ctx.booleanValue("GetSolutionListResponse.Result["+ i +"].DataFlag"));
			resultItem.setProjectTypeName(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ProjectTypeName"));
			resultItem.setStatus(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Status"));
			resultItem.setCbmOwner(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].CbmOwner"));
			resultItem.setProductType(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ProductType"));
			resultItem.setProduct3Name(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Product3Name"));
			resultItem.setScenario(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Scenario"));
			resultItem.setNetworkArch(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].NetworkArch"));
			resultItem.setUid(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Uid"));
			resultItem.setGmtCreate(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].GmtCreate"));
			resultItem.setScPlanIds(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ScPlanIds"));
			resultItem.setSupplyQty(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].SupplyQty"));
			resultItem.setId(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].Id"));
			resultItem.setAssetReceiverNick(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].AssetReceiverNick"));
			resultItem.setUseCapacityCnt(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].UseCapacityCnt"));
			resultItem.setOrders(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Orders"));
			resultItem.setProduct3(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Product3"));
			resultItem.setProduct1(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Product1"));
			resultItem.setProjectName(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ProjectName"));
			resultItem.setProduct2(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Product2"));
			resultItem.setSourceId(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].SourceId"));
			resultItem.setProduct1Name(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Product1Name"));
			resultItem.setMoveExecuteQty(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].MoveExecuteQty"));
			resultItem.setUseL2PoolCnt(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].UseL2PoolCnt"));
			resultItem.setAscriptionClass(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].AscriptionClass"));
			resultItem.setExpectTurnOverDateStr(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ExpectTurnOverDateStr"));
			resultItem.setDeployProduct1(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DeployProduct1"));
			resultItem.setDcsSource(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DcsSource"));
			resultItem.setDeployProduct3(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DeployProduct3"));
			resultItem.setDeployProduct2(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DeployProduct2"));
			resultItem.setMoveQty(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].MoveQty"));
			resultItem.setUsePoolMoveDetail(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].UsePoolMoveDetail"));
			resultItem.setLogicZone(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].LogicZone"));
			resultItem.setSupplyArea(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].SupplyArea"));
			resultItem.setManufacturingBrandCode(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ManufacturingBrandCode"));
			resultItem.setExecuteFlag(_ctx.booleanValue("GetSolutionListResponse.Result["+ i +"].ExecuteFlag"));
			resultItem.setDemandClass(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandClass"));
			resultItem.setMoveDeliveredQty(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].MoveDeliveredQty"));
			resultItem.setTenantId(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].TenantId"));
			resultItem.setDeployProduct3Name(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DeployProduct3Name"));
			resultItem.setAutoExecute(_ctx.booleanValue("GetSolutionListResponse.Result["+ i +"].AutoExecute"));
			resultItem.setDemandQty(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].DemandQty"));
			resultItem.setBusinessType(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].BusinessType"));
			resultItem.setIdc(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Idc"));
			resultItem.setBrandCode(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].BrandCode"));
			resultItem.setCreator(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Creator"));
			resultItem.setBrandId(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].BrandId"));
			resultItem.setInstallName(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].InstallName"));
			resultItem.setEvaluateStatus(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].EvaluateStatus"));
			resultItem.setManufacturingBrandId(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].ManufacturingBrandId"));
			resultItem.setSafeYear(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].SafeYear"));
			resultItem.setMoveOrders(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].MoveOrders"));
			resultItem.setSupplyLevel(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].SupplyLevel"));
			resultItem.setRequireTypeName(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].RequireTypeName"));
			resultItem.setConfigModel(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ConfigModel"));
			resultItem.setUpdater(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Updater"));
			resultItem.setExpectTurnOverDate(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].ExpectTurnOverDate"));
			resultItem.setSupplyType(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].SupplyType"));
			resultItem.setDeployProduct1Name(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DeployProduct1Name"));
			resultItem.setInstall(_ctx.booleanValue("GetSolutionListResponse.Result["+ i +"].Install"));
			resultItem.setUseSupplyCnt(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].UseSupplyCnt"));
			resultItem.setAzone(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Azone"));
			resultItem.setPurchaseCnt(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].PurchaseCnt"));
			resultItem.setShiftMethod(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ShiftMethod"));
			resultItem.setBenefitOld(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].BenefitOld"));
			resultItem.setIndustryLine(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].IndustryLine"));
			resultItem.setPurchaseOrders(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].PurchaseOrders"));
			resultItem.setFcstId(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].FcstId"));
			resultItem.setPriority(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Priority"));
			resultItem.setUsePlanCnt(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].UsePlanCnt"));
			resultItem.setRackAssignCnt(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].RackAssignCnt"));
			resultItem.setAssignVersion(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].AssignVersion"));
			resultItem.setFeatureStr(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].FeatureStr"));
			resultItem.setExecuteError(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ExecuteError"));
			resultItem.setAssetReceiver(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].AssetReceiver"));
			resultItem.setUsePoolInPlaceCnt(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].UsePoolInPlaceCnt"));
			resultItem.setSectionRackStatus(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].SectionRackStatus"));
			resultItem.setProjectType(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ProjectType"));
			resultItem.setRegion(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Region"));
			resultItem.setSectionRackAvailableDate(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].SectionRackAvailableDate"));
			resultItem.setDcsSourceId(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DcsSourceId"));
			resultItem.setOperator(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Operator"));
			resultItem.setClassZone(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ClassZone"));
			resultItem.setOrg(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Org"));
			resultItem.setManualBrandName(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ManualBrandName"));
			resultItem.setGmtModified(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].GmtModified"));
			resultItem.setClassZoneName(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ClassZoneName"));
			resultItem.setReplenishUnit(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ReplenishUnit"));
			resultItem.setSource(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Source"));
			resultItem.setProduct2Name(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Product2Name"));
			resultItem.setExecuteQty(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].ExecuteQty"));
			resultItem.setUsePoolInPlaceDetail(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].UsePoolInPlaceDetail"));
			resultItem.setSupplyDeliveredQty(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].SupplyDeliveredQty"));
			resultItem.setFeatures(_ctx.mapValue("GetSolutionListResponse.Result["+ i +"].Features"));
			resultItem.setProjectCode(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].ProjectCode"));
			resultItem.setInstallId(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].InstallId"));
			resultItem.setSectionRackAssignCnt(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].SectionRackAssignCnt"));
			resultItem.setUsePoolMoveCnt(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].UsePoolMoveCnt"));
			resultItem.setAppGroup(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].AppGroup"));
			resultItem.setComments(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Comments"));
			resultItem.setUsePoolCnt(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].UsePoolCnt"));
			resultItem.setOsName(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].OsName"));
			resultItem.setCluster(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].Cluster"));
			resultItem.setAbleExecute(_ctx.booleanValue("GetSolutionListResponse.Result["+ i +"].AbleExecute"));
			resultItem.setUsePoolDetail(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].UsePoolDetail"));
			resultItem.setBusinessTypeName(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].BusinessTypeName"));
			resultItem.setUseSupplyDate(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].UseSupplyDate"));
			resultItem.setPreExecuteRequest(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].PreExecuteRequest"));
			resultItem.setSafeZone(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].SafeZone"));

			List<String> rackInfo = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetSolutionListResponse.Result["+ i +"].RackInfo.Length"); j++) {
				rackInfo.add(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].RackInfo["+ j +"]"));
			}
			resultItem.setRackInfo(rackInfo);

			DemandDeploy demandDeploy = new DemandDeploy();
			demandDeploy.setNetArch(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandDeploy.NetArch"));
			demandDeploy.setFrameworkClass(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandDeploy.FrameworkClass"));
			demandDeploy.setDeployMode(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandDeploy.DeployMode"));
			demandDeploy.setDeployLocation(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandDeploy.DeployLocation"));
			demandDeploy.setDeployArch(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandDeploy.DeployArch"));
			demandDeploy.setNodeType(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandDeploy.NodeType"));
			demandDeploy.setDeployLevel(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandDeploy.DeployLevel"));
			demandDeploy.setBoxModel(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandDeploy.BoxModel"));
			demandDeploy.setPublicNetWorkExport(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandDeploy.PublicNetWorkExport"));
			demandDeploy.setBoxUpLink(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandDeploy.BoxUpLink"));
			demandDeploy.setDeployRole(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandDeploy.DeployRole"));
			demandDeploy.setBoxDownLink(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandDeploy.BoxDownLink"));
			resultItem.setDemandDeploy(demandDeploy);

			DemandItem demandItem = new DemandItem();
			demandItem.setDemandItemType(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.DemandItemType"));

			ServerDTO serverDTO = new ServerDTO();
			serverDTO.setConfig(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ServerDTO.Config"));
			serverDTO.setModel(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ServerDTO.Model"));
			serverDTO.setNic(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ServerDTO.Nic"));
			demandItem.setServerDTO(serverDTO);

			NetPackValue netPackValue = new NetPackValue();

			List<ItemListItem> itemList = new ArrayList<ItemListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetSolutionListResponse.Result["+ i +"].DemandItem.NetPackValue.ItemList.Length"); j++) {
				ItemListItem itemListItem = new ItemListItem();
				itemListItem.setRole(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.NetPackValue.ItemList["+ j +"].Role"));
				itemListItem.setDemandQty(_ctx.longValue("GetSolutionListResponse.Result["+ i +"].DemandItem.NetPackValue.ItemList["+ j +"].DemandQty"));
				itemListItem.setResourceType(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.NetPackValue.ItemList["+ j +"].ResourceType"));
				itemListItem.setFramework(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.NetPackValue.ItemList["+ j +"].Framework"));
				itemListItem.setRemark(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.NetPackValue.ItemList["+ j +"].Remark"));

				itemList.add(itemListItem);
			}
			netPackValue.setItemList(itemList);
			demandItem.setNetPackValue(netPackValue);

			PubNetAccessValue pubNetAccessValue = new PubNetAccessValue();

			List<ItemListItem2> itemList1 = new ArrayList<ItemListItem2>();
			for (int j = 0; j < _ctx.lengthValue("GetSolutionListResponse.Result["+ i +"].DemandItem.PubNetAccessValue.ItemList.Length"); j++) {
				ItemListItem2 itemListItem2 = new ItemListItem2();
				itemListItem2.setPrice(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.PubNetAccessValue.ItemList["+ j +"].Price"));
				itemListItem2.setBandwidth(_ctx.floatValue("GetSolutionListResponse.Result["+ i +"].DemandItem.PubNetAccessValue.ItemList["+ j +"].Bandwidth"));
				itemListItem2.setAccessType(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.PubNetAccessValue.ItemList["+ j +"].AccessType"));

				itemList1.add(itemListItem2);
			}
			pubNetAccessValue.setItemList1(itemList1);
			demandItem.setPubNetAccessValue(pubNetAccessValue);

			ServiceValue serviceValue = new ServiceValue();

			List<ItemListItem4> itemList3 = new ArrayList<ItemListItem4>();
			for (int j = 0; j < _ctx.lengthValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList.Length"); j++) {
				ItemListItem4 itemListItem4 = new ItemListItem4();
				itemListItem4.setServiceTypeName(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].ServiceTypeName"));
				itemListItem4.setArea(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].Area"));
				itemListItem4.setYear(_ctx.floatValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].Year"));
				itemListItem4.setServiceType(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].ServiceType"));
				itemListItem4.setAmount(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].Amount"));
				itemListItem4.setIdc(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].Idc"));
				itemListItem4.setServiceItemName(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].ServiceItemName"));
				itemListItem4.setCity(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].City"));
				itemListItem4.setServiceItem(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].ServiceItem"));
				itemListItem4.setRemark(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ServiceValue.ItemList["+ j +"].Remark"));

				itemList3.add(itemListItem4);
			}
			serviceValue.setItemList3(itemList3);
			demandItem.setServiceValue(serviceValue);

			ComboValue comboValue = new ComboValue();
			comboValue.setSkuId(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.SkuId"));

			List<ServerDemandListItem> serverDemandList = new ArrayList<ServerDemandListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList.Length"); j++) {
				ServerDemandListItem serverDemandListItem = new ServerDemandListItem();
				serverDemandListItem.setItem(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].Item"));
				serverDemandListItem.setProduct3(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].Product3"));
				serverDemandListItem.setAgreedQuantity(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].AgreedQuantity"));
				serverDemandListItem.setQuantity(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].Quantity"));
				serverDemandListItem.setSkuId(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].SkuId"));
				serverDemandListItem.setAppGroup(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].AppGroup"));

				List<String> snList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].SnList.Length"); k++) {
					snList.add(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.ServerDemandList["+ j +"].SnList["+ k +"]"));
				}
				serverDemandListItem.setSnList(snList);

				serverDemandList.add(serverDemandListItem);
			}
			comboValue.setServerDemandList(serverDemandList);

			List<WholeRackListItem> wholeRackList = new ArrayList<WholeRackListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList.Length"); j++) {
				WholeRackListItem wholeRackListItem = new WholeRackListItem();
				wholeRackListItem.setOrder(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].Order"));
				wholeRackListItem.setRackPackage(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].RackPackage"));

				List<ServerDemandListItem6> serverDemandList5 = new ArrayList<ServerDemandListItem6>();
				for (int k = 0; k < _ctx.lengthValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList.Length"); k++) {
					ServerDemandListItem6 serverDemandListItem6 = new ServerDemandListItem6();
					serverDemandListItem6.setItem(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].Item"));
					serverDemandListItem6.setProduct3(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].Product3"));
					serverDemandListItem6.setAgreedQuantity(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].AgreedQuantity"));
					serverDemandListItem6.setQuantity(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].Quantity"));
					serverDemandListItem6.setSkuId(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].SkuId"));
					serverDemandListItem6.setAppGroup(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].AppGroup"));

					List<String> snList7 = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].SnList.Length"); l++) {
						snList7.add(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ComboValue.WholeRackList["+ j +"].ServerDemandList["+ k +"].SnList["+ l +"]"));
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
			for (int j = 0; j < _ctx.lengthValue("GetSolutionListResponse.Result["+ i +"].DemandItem.RackValue.ItemList.Length"); j++) {
				ItemListItem9 itemListItem9 = new ItemListItem9();
				itemListItem9.setRackNum(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].DemandItem.RackValue.ItemList["+ j +"].RackNum"));
				itemListItem9.setRoomCode(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.RackValue.ItemList["+ j +"].RoomCode"));
				itemListItem9.setPower(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.RackValue.ItemList["+ j +"].Power"));
				itemListItem9.setPowUtilizationRate(_ctx.floatValue("GetSolutionListResponse.Result["+ i +"].DemandItem.RackValue.ItemList["+ j +"].PowUtilizationRate"));

				itemList8.add(itemListItem9);
			}
			rackValue.setItemList8(itemList8);
			demandItem.setRackValue(rackValue);

			ExchangeValue exchangeValue = new ExchangeValue();

			List<String> exchangeList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ExchangeValue.ExchangeList.Length"); j++) {
				exchangeList.add(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ExchangeValue.ExchangeList["+ j +"]"));
			}
			exchangeValue.setExchangeList(exchangeList);

			List<ServerDemandListItem11> serverDemandList10 = new ArrayList<ServerDemandListItem11>();
			for (int j = 0; j < _ctx.lengthValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList.Length"); j++) {
				ServerDemandListItem11 serverDemandListItem11 = new ServerDemandListItem11();
				serverDemandListItem11.setItem(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].Item"));
				serverDemandListItem11.setProduct3(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].Product3"));
				serverDemandListItem11.setAgreedQuantity(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].AgreedQuantity"));
				serverDemandListItem11.setQuantity(_ctx.integerValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].Quantity"));
				serverDemandListItem11.setSkuId(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].SkuId"));
				serverDemandListItem11.setAppGroup(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].AppGroup"));

				List<String> snList12 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].SnList.Length"); k++) {
					snList12.add(_ctx.stringValue("GetSolutionListResponse.Result["+ i +"].DemandItem.ExchangeValue.ServerDemandList["+ j +"].SnList["+ k +"]"));
				}
				serverDemandListItem11.setSnList12(snList12);

				serverDemandList10.add(serverDemandListItem11);
			}
			exchangeValue.setServerDemandList10(serverDemandList10);
			demandItem.setExchangeValue(exchangeValue);
			resultItem.setDemandItem(demandItem);

			result.add(resultItem);
		}
		getSolutionListResponse.setResult(result);
	 
	 	return getSolutionListResponse;
	}
}