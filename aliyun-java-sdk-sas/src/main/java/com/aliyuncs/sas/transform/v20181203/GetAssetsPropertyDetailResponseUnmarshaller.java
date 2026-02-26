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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.GetAssetsPropertyDetailResponse;
import com.aliyuncs.sas.model.v20181203.GetAssetsPropertyDetailResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.GetAssetsPropertyDetailResponse.Property;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAssetsPropertyDetailResponseUnmarshaller {

	public static GetAssetsPropertyDetailResponse unmarshall(GetAssetsPropertyDetailResponse getAssetsPropertyDetailResponse, UnmarshallerContext _ctx) {
		
		getAssetsPropertyDetailResponse.setRequestId(_ctx.stringValue("GetAssetsPropertyDetailResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("GetAssetsPropertyDetailResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("GetAssetsPropertyDetailResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("GetAssetsPropertyDetailResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("GetAssetsPropertyDetailResponse.PageInfo.Count"));
		getAssetsPropertyDetailResponse.setPageInfo(pageInfo);

		List<Property> propertys = new ArrayList<Property>();
		for (int i = 0; i < _ctx.lengthValue("GetAssetsPropertyDetailResponse.Propertys.Length"); i++) {
			Property property = new Property();
			property.setModuleName(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].ModuleName"));
			property.setSize(_ctx.integerValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].Size"));
			property.setFilepath(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].Filepath"));
			property.setUsedByCount(_ctx.integerValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].UsedByCount"));
			property.setPath(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].Path"));
			property.setServerType(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].ServerType"));
			property.setPort(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].Port"));
			property.setPid(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].Pid"));
			property.setListenIp(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].ListenIp"));
			property.setListenStatus(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].ListenStatus"));
			property.setListenProtocol(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].ListenProtocol"));
			property.setProcessStarted(_ctx.longValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].ProcessStarted"));
			property.setProcessStartedTime(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].ProcessStartedTime"));
			property.setWebPath(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].WebPath"));
			property.setDomain(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].Domain"));
			property.setUser(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].User"));
			property.setPathMode(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].PathMode"));
			property.setInstanceId(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].InstanceId"));
			property.setIntranetIp(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].IntranetIp"));
			property.setInternetIp(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].InternetIp"));
			property.setIp(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].Ip"));
			property.setUuid(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].Uuid"));
			property.setInstanceName(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].InstanceName"));
			property.setRegionId(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].RegionId"));
			property.setCreateTimestamp(_ctx.longValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].CreateTimestamp"));
			property.setId(_ctx.longValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].Id"));
			property.setImageName(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].ImageName"));
			property.setContainerName(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].ContainerName"));
			property.setRuntimeEnvVersion(_ctx.stringValue("GetAssetsPropertyDetailResponse.Propertys["+ i +"].RuntimeEnvVersion"));

			propertys.add(property);
		}
		getAssetsPropertyDetailResponse.setPropertys(propertys);
	 
	 	return getAssetsPropertyDetailResponse;
	}
}