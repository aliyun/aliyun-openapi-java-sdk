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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.CommodityEntitiesItem;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.CommoditySpecification;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.ServiceInfo;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceResponseUnmarshaller {

	public static GetServiceResponse unmarshall(GetServiceResponse getServiceResponse, UnmarshallerContext _ctx) {
		
		getServiceResponse.setRequestId(_ctx.stringValue("GetServiceResponse.RequestId"));
		getServiceResponse.setStatus(_ctx.stringValue("GetServiceResponse.Status"));
		getServiceResponse.setDeployMetadata(_ctx.stringValue("GetServiceResponse.DeployMetadata"));
		getServiceResponse.setPublishTime(_ctx.stringValue("GetServiceResponse.PublishTime"));
		getServiceResponse.setVersion(_ctx.stringValue("GetServiceResponse.Version"));
		getServiceResponse.setDeployType(_ctx.stringValue("GetServiceResponse.DeployType"));
		getServiceResponse.setServiceId(_ctx.stringValue("GetServiceResponse.ServiceId"));
		getServiceResponse.setSupplierUrl(_ctx.stringValue("GetServiceResponse.SupplierUrl"));
		getServiceResponse.setServiceDocUrl(_ctx.stringValue("GetServiceResponse.ServiceDocUrl"));
		getServiceResponse.setServiceProductUrl(_ctx.stringValue("GetServiceResponse.ServiceProductUrl"));
		getServiceResponse.setServiceType(_ctx.stringValue("GetServiceResponse.ServiceType"));
		getServiceResponse.setSupplierName(_ctx.stringValue("GetServiceResponse.SupplierName"));
		getServiceResponse.setCommodityCode(_ctx.stringValue("GetServiceResponse.CommodityCode"));
		getServiceResponse.setIsSupportOperated(_ctx.booleanValue("GetServiceResponse.IsSupportOperated"));
		getServiceResponse.setPolicyNames(_ctx.stringValue("GetServiceResponse.PolicyNames"));
		getServiceResponse.setDuration(_ctx.longValue("GetServiceResponse.Duration"));
		getServiceResponse.setProgress(_ctx.longValue("GetServiceResponse.Progress"));
		getServiceResponse.setStatusDetail(_ctx.stringValue("GetServiceResponse.StatusDetail"));
		getServiceResponse.setCreateTime(_ctx.stringValue("GetServiceResponse.CreateTime"));
		getServiceResponse.setUpdateTime(_ctx.stringValue("GetServiceResponse.UpdateTime"));
		getServiceResponse.setShareType(_ctx.stringValue("GetServiceResponse.ShareType"));
		getServiceResponse.setAlarmMetadata(_ctx.stringValue("GetServiceResponse.AlarmMetadata"));
		getServiceResponse.setUpgradeMetadata(_ctx.stringValue("GetServiceResponse.UpgradeMetadata"));
		getServiceResponse.setVersionName(_ctx.stringValue("GetServiceResponse.VersionName"));
		getServiceResponse.setPayFromType(_ctx.stringValue("GetServiceResponse.PayFromType"));
		getServiceResponse.setPayType(_ctx.stringValue("GetServiceResponse.PayType"));
		getServiceResponse.setDefaultLicenseDays(_ctx.longValue("GetServiceResponse.DefaultLicenseDays"));
		getServiceResponse.setTrialDuration(_ctx.longValue("GetServiceResponse.TrialDuration"));
		getServiceResponse.setTrialType(_ctx.stringValue("GetServiceResponse.TrialType"));
		getServiceResponse.setTenantType(_ctx.stringValue("GetServiceResponse.TenantType"));
		getServiceResponse.setLicenseMetadata(_ctx.stringValue("GetServiceResponse.LicenseMetadata"));
		getServiceResponse.setOperationMetadata(_ctx.stringValue("GetServiceResponse.OperationMetadata"));
		getServiceResponse.setTestStatus(_ctx.stringValue("GetServiceResponse.TestStatus"));
		getServiceResponse.setApprovalType(_ctx.stringValue("GetServiceResponse.ApprovalType"));
		getServiceResponse.setRegistrationId(_ctx.stringValue("GetServiceResponse.RegistrationId"));
		getServiceResponse.setResourceGroupId(_ctx.stringValue("GetServiceResponse.ResourceGroupId"));
		getServiceResponse.setPermission(_ctx.stringValue("GetServiceResponse.Permission"));

		List<ServiceInfo> serviceInfos = new ArrayList<ServiceInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.ServiceInfos.Length"); i++) {
			ServiceInfo serviceInfo = new ServiceInfo();
			serviceInfo.setLocale(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].Locale"));
			serviceInfo.setImage(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].Image"));
			serviceInfo.setName(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].Name"));
			serviceInfo.setShortDescription(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].ShortDescription"));

			serviceInfos.add(serviceInfo);
		}
		getServiceResponse.setServiceInfos(serviceInfos);

		List<CommoditySpecification> commoditySpecifications = new ArrayList<CommoditySpecification>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.CommoditySpecifications.Length"); i++) {
			CommoditySpecification commoditySpecification = new CommoditySpecification();
			commoditySpecification.setSpecificationCode(_ctx.stringValue("GetServiceResponse.CommoditySpecifications["+ i +"].SpecificationCode"));
			commoditySpecification.setTemplateName(_ctx.stringValue("GetServiceResponse.CommoditySpecifications["+ i +"].TemplateName"));
			commoditySpecification.setPredefinedParameterName(_ctx.stringValue("GetServiceResponse.CommoditySpecifications["+ i +"].PredefinedParameterName"));

			commoditySpecifications.add(commoditySpecification);
		}
		getServiceResponse.setCommoditySpecifications(commoditySpecifications);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("GetServiceResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("GetServiceResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		getServiceResponse.setTags(tags);

		List<CommodityEntitiesItem> commodityEntities = new ArrayList<CommodityEntitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.CommodityEntities.Length"); i++) {
			CommodityEntitiesItem commodityEntitiesItem = new CommodityEntitiesItem();
			commodityEntitiesItem.setTemplateName(_ctx.stringValue("GetServiceResponse.CommodityEntities["+ i +"].TemplateName"));
			commodityEntitiesItem.setPredefinedParameterName(_ctx.stringValue("GetServiceResponse.CommodityEntities["+ i +"].PredefinedParameterName"));

			List<String> entityIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceResponse.CommodityEntities["+ i +"].EntityIds.Length"); j++) {
				entityIds.add(_ctx.stringValue("GetServiceResponse.CommodityEntities["+ i +"].EntityIds["+ j +"]"));
			}
			commodityEntitiesItem.setEntityIds(entityIds);

			commodityEntities.add(commodityEntitiesItem);
		}
		getServiceResponse.setCommodityEntities(commodityEntities);
	 
	 	return getServiceResponse;
	}
}