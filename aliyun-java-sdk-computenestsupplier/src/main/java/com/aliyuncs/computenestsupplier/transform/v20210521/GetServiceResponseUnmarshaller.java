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
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.Commodity;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.Commodity.CssMetadata;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.Commodity.CssMetadata.ComponentsMappingsItem;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.Commodity.CssMetadata.MeteringEntityExtraInfosItem4;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.Commodity.CssMetadata.MeteringEntityMappingsItem3;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.Commodity.MarketplaceMetadata;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.Commodity.MarketplaceMetadata.MeteringEntityExtraInfosItem;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.Commodity.MarketplaceMetadata.MeteringEntityMappingsItem;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.Commodity.MarketplaceMetadata.SpecificationMappingsItem;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.Commodity.MeteringEntitiesItem;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.Commodity.SpecificationsItem;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.ServiceInfo;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.ServiceInfo.AgreementsItem;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.Statistic;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.Tag;
import java.util.Map;
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
		getServiceResponse.setSourceServiceId(_ctx.stringValue("GetServiceResponse.SourceServiceId"));
		getServiceResponse.setSourceServiceVersion(_ctx.stringValue("GetServiceResponse.SourceServiceVersion"));
		getServiceResponse.setSourceSupplierName(_ctx.stringValue("GetServiceResponse.SourceSupplierName"));
		getServiceResponse.setLogMetadata(_ctx.stringValue("GetServiceResponse.LogMetadata"));
		getServiceResponse.setResellable(_ctx.booleanValue("GetServiceResponse.Resellable"));
		getServiceResponse.setVirtualInternetService(_ctx.stringValue("GetServiceResponse.VirtualInternetService"));
		getServiceResponse.setServiceDiscoverable(_ctx.stringValue("GetServiceResponse.ServiceDiscoverable"));
		getServiceResponse.setCategories(_ctx.stringValue("GetServiceResponse.Categories"));
		getServiceResponse.setShareTypeStatus(_ctx.stringValue("GetServiceResponse.ShareTypeStatus"));
		getServiceResponse.setServiceAuditDocumentUrl(_ctx.stringValue("GetServiceResponse.ServiceAuditDocumentUrl"));
		getServiceResponse.setEntitySource(_ctx.mapValue("GetServiceResponse.EntitySource"));
		getServiceResponse.setCrossRegionConnectionStatus(_ctx.stringValue("GetServiceResponse.CrossRegionConnectionStatus"));
		getServiceResponse.setVirtualInternetServiceId(_ctx.stringValue("GetServiceResponse.VirtualInternetServiceId"));
		getServiceResponse.setBuildInfo(_ctx.stringValue("GetServiceResponse.BuildInfo"));

		Statistic statistic = new Statistic();
		statistic.setAccumulativeInstanceCount(_ctx.integerValue("GetServiceResponse.Statistic.AccumulativeInstanceCount"));
		statistic.setAccumulativeUserCount(_ctx.integerValue("GetServiceResponse.Statistic.AccumulativeUserCount"));
		statistic.setDeployedServiceInstanceCount(_ctx.integerValue("GetServiceResponse.Statistic.DeployedServiceInstanceCount"));
		statistic.setDeployedUserCount(_ctx.integerValue("GetServiceResponse.Statistic.DeployedUserCount"));
		statistic.setSubmittedUsageCount(_ctx.integerValue("GetServiceResponse.Statistic.SubmittedUsageCount"));
		statistic.setAccumulativePocAmount(_ctx.doubleValue("GetServiceResponse.Statistic.AccumulativePocAmount"));
		statistic.setAveragePocAmount(_ctx.doubleValue("GetServiceResponse.Statistic.AveragePocAmount"));
		statistic.setAveragePocUnitAmount(_ctx.doubleValue("GetServiceResponse.Statistic.AveragePocUnitAmount"));
		statistic.setAveragePocDuration(_ctx.doubleValue("GetServiceResponse.Statistic.AveragePocDuration"));
		getServiceResponse.setStatistic(statistic);

		Commodity commodity = new Commodity();
		commodity.setType(_ctx.stringValue("GetServiceResponse.Commodity.Type"));
		commodity.setChargeType(_ctx.stringValue("GetServiceResponse.Commodity.ChargeType"));
		commodity.setCommodityCode(_ctx.stringValue("GetServiceResponse.Commodity.CommodityCode"));
		commodity.setSaasBoostMetadata(_ctx.stringValue("GetServiceResponse.Commodity.SaasBoostMetadata"));

		List<String> components = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Commodity.Components.Length"); i++) {
			components.add(_ctx.stringValue("GetServiceResponse.Commodity.Components["+ i +"]"));
		}
		commodity.setComponents(components);

		MarketplaceMetadata marketplaceMetadata = new MarketplaceMetadata();

		List<SpecificationMappingsItem> specificationMappings = new ArrayList<SpecificationMappingsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Commodity.MarketplaceMetadata.SpecificationMappings.Length"); i++) {
			SpecificationMappingsItem specificationMappingsItem = new SpecificationMappingsItem();
			specificationMappingsItem.setSpecificationCode(_ctx.stringValue("GetServiceResponse.Commodity.MarketplaceMetadata.SpecificationMappings["+ i +"].SpecificationCode"));
			specificationMappingsItem.setTemplateName(_ctx.stringValue("GetServiceResponse.Commodity.MarketplaceMetadata.SpecificationMappings["+ i +"].TemplateName"));
			specificationMappingsItem.setSpecificationName(_ctx.stringValue("GetServiceResponse.Commodity.MarketplaceMetadata.SpecificationMappings["+ i +"].SpecificationName"));
			specificationMappingsItem.setTrialType(_ctx.stringValue("GetServiceResponse.Commodity.MarketplaceMetadata.SpecificationMappings["+ i +"].TrialType"));

			specificationMappings.add(specificationMappingsItem);
		}
		marketplaceMetadata.setSpecificationMappings(specificationMappings);

		List<MeteringEntityMappingsItem> meteringEntityMappings = new ArrayList<MeteringEntityMappingsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Commodity.MarketplaceMetadata.MeteringEntityMappings.Length"); i++) {
			MeteringEntityMappingsItem meteringEntityMappingsItem = new MeteringEntityMappingsItem();
			meteringEntityMappingsItem.setEntityIds(_ctx.stringValue("GetServiceResponse.Commodity.MarketplaceMetadata.MeteringEntityMappings["+ i +"].EntityIds"));
			meteringEntityMappingsItem.setTemplateName(_ctx.stringValue("GetServiceResponse.Commodity.MarketplaceMetadata.MeteringEntityMappings["+ i +"].TemplateName"));
			meteringEntityMappingsItem.setSpecificationName(_ctx.stringValue("GetServiceResponse.Commodity.MarketplaceMetadata.MeteringEntityMappings["+ i +"].SpecificationName"));

			meteringEntityMappings.add(meteringEntityMappingsItem);
		}
		marketplaceMetadata.setMeteringEntityMappings(meteringEntityMappings);

		List<MeteringEntityExtraInfosItem> meteringEntityExtraInfos = new ArrayList<MeteringEntityExtraInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Commodity.MarketplaceMetadata.MeteringEntityExtraInfos.Length"); i++) {
			MeteringEntityExtraInfosItem meteringEntityExtraInfosItem = new MeteringEntityExtraInfosItem();
			meteringEntityExtraInfosItem.setEntityId(_ctx.stringValue("GetServiceResponse.Commodity.MarketplaceMetadata.MeteringEntityExtraInfos["+ i +"].EntityId"));
			meteringEntityExtraInfosItem.setType(_ctx.stringValue("GetServiceResponse.Commodity.MarketplaceMetadata.MeteringEntityExtraInfos["+ i +"].Type"));
			meteringEntityExtraInfosItem.setMetricName(_ctx.stringValue("GetServiceResponse.Commodity.MarketplaceMetadata.MeteringEntityExtraInfos["+ i +"].MetricName"));
			meteringEntityExtraInfosItem.setPromql(_ctx.stringValue("GetServiceResponse.Commodity.MarketplaceMetadata.MeteringEntityExtraInfos["+ i +"].Promql"));

			meteringEntityExtraInfos.add(meteringEntityExtraInfosItem);
		}
		marketplaceMetadata.setMeteringEntityExtraInfos(meteringEntityExtraInfos);
		commodity.setMarketplaceMetadata(marketplaceMetadata);

		CssMetadata cssMetadata = new CssMetadata();

		List<ComponentsMappingsItem> componentsMappings = new ArrayList<ComponentsMappingsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Commodity.CssMetadata.ComponentsMappings.Length"); i++) {
			ComponentsMappingsItem componentsMappingsItem = new ComponentsMappingsItem();
			componentsMappingsItem.setMappings(_ctx.mapValue("GetServiceResponse.Commodity.CssMetadata.ComponentsMappings["+ i +"].Mappings"));
			componentsMappingsItem.setTemplateName(_ctx.stringValue("GetServiceResponse.Commodity.CssMetadata.ComponentsMappings["+ i +"].TemplateName"));

			componentsMappings.add(componentsMappingsItem);
		}
		cssMetadata.setComponentsMappings(componentsMappings);

		List<MeteringEntityMappingsItem3> meteringEntityMappings1 = new ArrayList<MeteringEntityMappingsItem3>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Commodity.CssMetadata.MeteringEntityMappings.Length"); i++) {
			MeteringEntityMappingsItem3 meteringEntityMappingsItem3 = new MeteringEntityMappingsItem3();
			meteringEntityMappingsItem3.setEntityIds(_ctx.stringValue("GetServiceResponse.Commodity.CssMetadata.MeteringEntityMappings["+ i +"].EntityIds"));
			meteringEntityMappingsItem3.setTemplateName(_ctx.stringValue("GetServiceResponse.Commodity.CssMetadata.MeteringEntityMappings["+ i +"].TemplateName"));
			meteringEntityMappingsItem3.setSpecificationName(_ctx.stringValue("GetServiceResponse.Commodity.CssMetadata.MeteringEntityMappings["+ i +"].SpecificationName"));

			meteringEntityMappings1.add(meteringEntityMappingsItem3);
		}
		cssMetadata.setMeteringEntityMappings1(meteringEntityMappings1);

		List<MeteringEntityExtraInfosItem4> meteringEntityExtraInfos2 = new ArrayList<MeteringEntityExtraInfosItem4>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Commodity.CssMetadata.MeteringEntityExtraInfos.Length"); i++) {
			MeteringEntityExtraInfosItem4 meteringEntityExtraInfosItem4 = new MeteringEntityExtraInfosItem4();
			meteringEntityExtraInfosItem4.setEntityId(_ctx.stringValue("GetServiceResponse.Commodity.CssMetadata.MeteringEntityExtraInfos["+ i +"].EntityId"));
			meteringEntityExtraInfosItem4.setType(_ctx.stringValue("GetServiceResponse.Commodity.CssMetadata.MeteringEntityExtraInfos["+ i +"].Type"));
			meteringEntityExtraInfosItem4.setMetricName(_ctx.stringValue("GetServiceResponse.Commodity.CssMetadata.MeteringEntityExtraInfos["+ i +"].MetricName"));
			meteringEntityExtraInfosItem4.setPromql(_ctx.stringValue("GetServiceResponse.Commodity.CssMetadata.MeteringEntityExtraInfos["+ i +"].Promql"));

			meteringEntityExtraInfos2.add(meteringEntityExtraInfosItem4);
		}
		cssMetadata.setMeteringEntityExtraInfos2(meteringEntityExtraInfos2);
		commodity.setCssMetadata(cssMetadata);

		List<SpecificationsItem> specifications = new ArrayList<SpecificationsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Commodity.Specifications.Length"); i++) {
			SpecificationsItem specificationsItem = new SpecificationsItem();
			specificationsItem.setCode(_ctx.stringValue("GetServiceResponse.Commodity.Specifications["+ i +"].Code"));
			specificationsItem.setName(_ctx.stringValue("GetServiceResponse.Commodity.Specifications["+ i +"].Name"));

			List<String> times = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceResponse.Commodity.Specifications["+ i +"].Times.Length"); j++) {
				times.add(_ctx.stringValue("GetServiceResponse.Commodity.Specifications["+ i +"].Times["+ j +"]"));
			}
			specificationsItem.setTimes(times);

			specifications.add(specificationsItem);
		}
		commodity.setSpecifications(specifications);

		List<MeteringEntitiesItem> meteringEntities = new ArrayList<MeteringEntitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Commodity.MeteringEntities.Length"); i++) {
			MeteringEntitiesItem meteringEntitiesItem = new MeteringEntitiesItem();
			meteringEntitiesItem.setEntityId(_ctx.stringValue("GetServiceResponse.Commodity.MeteringEntities["+ i +"].EntityId"));
			meteringEntitiesItem.setName(_ctx.stringValue("GetServiceResponse.Commodity.MeteringEntities["+ i +"].Name"));

			meteringEntities.add(meteringEntitiesItem);
		}
		commodity.setMeteringEntities(meteringEntities);
		getServiceResponse.setCommodity(commodity);

		List<ServiceInfo> serviceInfos = new ArrayList<ServiceInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.ServiceInfos.Length"); i++) {
			ServiceInfo serviceInfo = new ServiceInfo();
			serviceInfo.setLocale(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].Locale"));
			serviceInfo.setImage(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].Image"));
			serviceInfo.setName(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].Name"));
			serviceInfo.setShortDescription(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].ShortDescription"));
			serviceInfo.setLongDescriptionUrl(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].LongDescriptionUrl"));

			List<AgreementsItem> agreements = new ArrayList<AgreementsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceResponse.ServiceInfos["+ i +"].Agreements.Length"); j++) {
				AgreementsItem agreementsItem = new AgreementsItem();
				agreementsItem.setName(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].Agreements["+ j +"].Name"));
				agreementsItem.setUrl(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].Agreements["+ j +"].Url"));

				agreements.add(agreementsItem);
			}
			serviceInfo.setAgreements(agreements);

			serviceInfos.add(serviceInfo);
		}
		getServiceResponse.setServiceInfos(serviceInfos);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("GetServiceResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("GetServiceResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		getServiceResponse.setTags(tags);
	 
	 	return getServiceResponse;
	}
}