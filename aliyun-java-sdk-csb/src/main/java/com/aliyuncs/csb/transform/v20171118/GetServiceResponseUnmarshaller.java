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

package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.GetServiceResponse;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.RouteConf;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.RouteConf.ImportConf;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameter;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameter;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.RouteConf.ImportConfs;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameter3;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameter4;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.ServiceVersion;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.VisiableGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceResponseUnmarshaller {

	public static GetServiceResponse unmarshall(GetServiceResponse getServiceResponse, UnmarshallerContext context) {
		
		getServiceResponse.setRequestId(context.stringValue("GetServiceResponse.RequestId"));
		getServiceResponse.setCode(context.integerValue("GetServiceResponse.Code"));
		getServiceResponse.setMessage(context.stringValue("GetServiceResponse.Message"));

		Data data = new Data();

		Service service = new Service();
		service.setAccessParamsJSON(context.stringValue("GetServiceResponse.Data.Service.AccessParamsJSON"));
		service.setActive(context.booleanValue("GetServiceResponse.Data.Service.Active"));
		service.setAlias(context.stringValue("GetServiceResponse.Data.Service.Alias"));
		service.setAllVisiable(context.booleanValue("GetServiceResponse.Data.Service.AllVisiable"));
		service.setApproveUserId(context.stringValue("GetServiceResponse.Data.Service.ApproveUserId"));
		service.setCasTargets(context.stringValue("GetServiceResponse.Data.Service.CasTargets"));
		service.setConsumeTypesJSON(context.stringValue("GetServiceResponse.Data.Service.ConsumeTypesJSON"));
		service.setCreateTime(context.longValue("GetServiceResponse.Data.Service.CreateTime"));
		service.setCsbId(context.longValue("GetServiceResponse.Data.Service.CsbId"));
		service.setErrDefJSON(context.stringValue("GetServiceResponse.Data.Service.ErrDefJSON"));
		service.setId(context.longValue("GetServiceResponse.Data.Service.Id"));
		service.setInterfaceName(context.stringValue("GetServiceResponse.Data.Service.InterfaceName"));
		service.setIpBlackStr(context.stringValue("GetServiceResponse.Data.Service.IpBlackStr"));
		service.setIpWhiteStr(context.stringValue("GetServiceResponse.Data.Service.IpWhiteStr"));
		service.setModelVersion(context.stringValue("GetServiceResponse.Data.Service.ModelVersion"));
		service.setModifiedTime(context.longValue("GetServiceResponse.Data.Service.ModifiedTime"));
		service.setOldVersion(context.stringValue("GetServiceResponse.Data.Service.OldVersion"));
		service.setOpenRestfulPath(context.stringValue("GetServiceResponse.Data.Service.OpenRestfulPath"));
		service.setOttFlag(context.booleanValue("GetServiceResponse.Data.Service.OttFlag"));
		service.setOwnerId(context.stringValue("GetServiceResponse.Data.Service.OwnerId"));
		service.setPolicyHandler(context.stringValue("GetServiceResponse.Data.Service.PolicyHandler"));
		service.setPrincipalName(context.stringValue("GetServiceResponse.Data.Service.PrincipalName"));
		service.setProjectId(context.longValue("GetServiceResponse.Data.Service.ProjectId"));
		service.setProjectName(context.stringValue("GetServiceResponse.Data.Service.ProjectName"));
		service.setProvideType(context.stringValue("GetServiceResponse.Data.Service.ProvideType"));
		service.setRouteConfJson(context.stringValue("GetServiceResponse.Data.Service.RouteConfJson"));
		service.setSSL(context.booleanValue("GetServiceResponse.Data.Service.SSL"));
		service.setScope(context.stringValue("GetServiceResponse.Data.Service.Scope"));
		service.setServiceName(context.stringValue("GetServiceResponse.Data.Service.ServiceName"));
		service.setServiceOpenRestfulPath(context.stringValue("GetServiceResponse.Data.Service.ServiceOpenRestfulPath"));
		service.setServiceProviderType(context.stringValue("GetServiceResponse.Data.Service.ServiceProviderType"));
		service.setServiceVersion(context.stringValue("GetServiceResponse.Data.Service.ServiceVersion"));
		service.setSkipAuth(context.booleanValue("GetServiceResponse.Data.Service.SkipAuth"));
		service.setStatisticName(context.stringValue("GetServiceResponse.Data.Service.StatisticName"));
		service.setStatus(context.integerValue("GetServiceResponse.Data.Service.Status"));
		service.setUserId(context.stringValue("GetServiceResponse.Data.Service.UserId"));
		service.setValidConsumeTypes(context.booleanValue("GetServiceResponse.Data.Service.ValidConsumeTypes"));
		service.setValidProvideType(context.booleanValue("GetServiceResponse.Data.Service.ValidProvideType"));

		List<String> casServTargets = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetServiceResponse.Data.Service.CasServTargets.Length"); i++) {
			casServTargets.add(context.stringValue("GetServiceResponse.Data.Service.CasServTargets["+ i +"]"));
		}
		service.setCasServTargets(casServTargets);

		List<String> consumeTypes = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetServiceResponse.Data.Service.ConsumeTypes.Length"); i++) {
			consumeTypes.add(context.stringValue("GetServiceResponse.Data.Service.ConsumeTypes["+ i +"]"));
		}
		service.setConsumeTypes(consumeTypes);

		RouteConf routeConf = new RouteConf();
		routeConf.setServiceRouteStrategy(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ServiceRouteStrategy"));

		ImportConf importConf = new ImportConf();
		importConf.setAccessEndpointJSON(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.AccessEndpointJSON"));
		importConf.setProvideType(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.ProvideType"));

		List<InputParameter> inputParameterMap = new ArrayList<InputParameter>();
		for (int i = 0; i < context.lengthValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap.Length"); i++) {
			InputParameter inputParameter = new InputParameter();
			inputParameter.setCatType(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].CatType"));
			inputParameter.setDepth(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].Depth"));
			inputParameter.setExtType(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].ExtType"));
			inputParameter.setMapStyle(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].MapStyle"));
			inputParameter.setOptional(context.booleanValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].Optional"));
			inputParameter.setOriginalName(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].OriginalName"));
			inputParameter.setParamType(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].ParamType"));
			inputParameter.setPassMethod(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].PassMethod"));
			inputParameter.setTargetName(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].TargetName"));

			inputParameterMap.add(inputParameter);
		}
		importConf.setInputParameterMap(inputParameterMap);

		List<OutputParameter> outputParameterMap = new ArrayList<OutputParameter>();
		for (int i = 0; i < context.lengthValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap.Length"); i++) {
			OutputParameter outputParameter = new OutputParameter();
			outputParameter.setCatType(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].CatType"));
			outputParameter.setDepth(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].Depth"));
			outputParameter.setExtType(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].ExtType"));
			outputParameter.setMapStyle(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].MapStyle"));
			outputParameter.setOptional(context.booleanValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].Optional"));
			outputParameter.setOriginalName(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].OriginalName"));
			outputParameter.setParamType(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].ParamType"));
			outputParameter.setPassMethod(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].PassMethod"));
			outputParameter.setTargetName(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].TargetName"));

			outputParameterMap.add(outputParameter);
		}
		importConf.setOutputParameterMap(outputParameterMap);
		routeConf.setImportConf(importConf);

		ImportConfs importConfs = new ImportConfs();
		importConfs.setAccessEndpointJSON(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.AccessEndpointJSON"));
		importConfs.setProvideType(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.ProvideType"));

		List<InputParameter3> inputParameterMap1 = new ArrayList<InputParameter3>();
		for (int i = 0; i < context.lengthValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap.Length"); i++) {
			InputParameter3 inputParameter3 = new InputParameter3();
			inputParameter3.setCatType(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].CatType"));
			inputParameter3.setDepth(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].Depth"));
			inputParameter3.setExtType(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].ExtType"));
			inputParameter3.setMapStyle(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].MapStyle"));
			inputParameter3.setOptional(context.booleanValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].Optional"));
			inputParameter3.setOriginalName(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].OriginalName"));
			inputParameter3.setParamType(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].ParamType"));
			inputParameter3.setPassMethod(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].PassMethod"));
			inputParameter3.setTargetName(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].TargetName"));

			inputParameterMap1.add(inputParameter3);
		}
		importConfs.setInputParameterMap1(inputParameterMap1);

		List<OutputParameter4> outputParameterMap2 = new ArrayList<OutputParameter4>();
		for (int i = 0; i < context.lengthValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap.Length"); i++) {
			OutputParameter4 outputParameter4 = new OutputParameter4();
			outputParameter4.setCatType(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].CatType"));
			outputParameter4.setDepth(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].Depth"));
			outputParameter4.setExtType(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].ExtType"));
			outputParameter4.setMapStyle(context.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].MapStyle"));
			outputParameter4.setOptional(context.booleanValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].Optional"));
			outputParameter4.setOriginalName(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].OriginalName"));
			outputParameter4.setParamType(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].ParamType"));
			outputParameter4.setPassMethod(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].PassMethod"));
			outputParameter4.setTargetName(context.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].TargetName"));

			outputParameterMap2.add(outputParameter4);
		}
		importConfs.setOutputParameterMap2(outputParameterMap2);
		routeConf.setImportConfs(importConfs);
		service.setRouteConf(routeConf);

		List<ServiceVersion> serviceVersionsList = new ArrayList<ServiceVersion>();
		for (int i = 0; i < context.lengthValue("GetServiceResponse.Data.Service.ServiceVersionsList.Length"); i++) {
			ServiceVersion serviceVersion = new ServiceVersion();
			serviceVersion.setActive(context.booleanValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].Active"));
			serviceVersion.setAllVisiable(context.booleanValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].AllVisiable"));
			serviceVersion.setId(context.longValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].Id"));
			serviceVersion.setOldVersion(context.stringValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].OldVersion"));
			serviceVersion.setOttFlag(context.booleanValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].OttFlag"));
			serviceVersion.setSSL(context.booleanValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].SSL"));
			serviceVersion.setScope(context.stringValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].Scope"));
			serviceVersion.setServiceVersion(context.stringValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].ServiceVersion"));
			serviceVersion.setSkipAuth(context.booleanValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].SkipAuth"));
			serviceVersion.setStatisticName(context.stringValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].StatisticName"));
			serviceVersion.setStatus(context.integerValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].Status"));
			serviceVersion.setValidConsumeTypes(context.booleanValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].ValidConsumeTypes"));
			serviceVersion.setValidProvideType(context.booleanValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].ValidProvideType"));

			serviceVersionsList.add(serviceVersion);
		}
		service.setServiceVersionsList(serviceVersionsList);

		List<VisiableGroup> visiableGroupList = new ArrayList<VisiableGroup>();
		for (int i = 0; i < context.lengthValue("GetServiceResponse.Data.Service.VisiableGroupList.Length"); i++) {
			VisiableGroup visiableGroup = new VisiableGroup();
			visiableGroup.setId(context.longValue("GetServiceResponse.Data.Service.VisiableGroupList["+ i +"].Id"));
			visiableGroup.setGroupId(context.longValue("GetServiceResponse.Data.Service.VisiableGroupList["+ i +"].GroupId"));
			visiableGroup.setUserId(context.stringValue("GetServiceResponse.Data.Service.VisiableGroupList["+ i +"].UserId"));
			visiableGroup.setServiceId(context.longValue("GetServiceResponse.Data.Service.VisiableGroupList["+ i +"].ServiceId"));
			visiableGroup.setCreateTime(context.longValue("GetServiceResponse.Data.Service.VisiableGroupList["+ i +"].CreateTime"));
			visiableGroup.setModifiedTime(context.longValue("GetServiceResponse.Data.Service.VisiableGroupList["+ i +"].ModifiedTime"));
			visiableGroup.setStatus(context.integerValue("GetServiceResponse.Data.Service.VisiableGroupList["+ i +"].Status"));

			visiableGroupList.add(visiableGroup);
		}
		service.setVisiableGroupList(visiableGroupList);
		data.setService(service);
		getServiceResponse.setData(data);
	 
	 	return getServiceResponse;
	}
}