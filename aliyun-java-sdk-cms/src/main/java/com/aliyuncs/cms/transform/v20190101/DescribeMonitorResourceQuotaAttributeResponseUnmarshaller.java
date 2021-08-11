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

package com.aliyuncs.cms.transform.v20190101;

import com.aliyuncs.cms.model.v20190101.DescribeMonitorResourceQuotaAttributeResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.Api;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.CustomMonitor;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.EnterpriseQuota;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.EventMonitor;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.LogMonitor;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.Phone;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SMS;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SiteMonitorEcsProbe;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SiteMonitorOperatorProbe;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SiteMonitorTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorResourceQuotaAttributeResponseUnmarshaller {

	public static DescribeMonitorResourceQuotaAttributeResponse unmarshall(DescribeMonitorResourceQuotaAttributeResponse describeMonitorResourceQuotaAttributeResponse, UnmarshallerContext _ctx) {
		
		describeMonitorResourceQuotaAttributeResponse.setRequestId(_ctx.stringValue("DescribeMonitorResourceQuotaAttributeResponse.RequestId"));
		describeMonitorResourceQuotaAttributeResponse.setCode(_ctx.stringValue("DescribeMonitorResourceQuotaAttributeResponse.Code"));
		describeMonitorResourceQuotaAttributeResponse.setMessage(_ctx.stringValue("DescribeMonitorResourceQuotaAttributeResponse.Message"));

		ResourceQuota resourceQuota = new ResourceQuota();
		resourceQuota.setExpireTime(_ctx.stringValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.ExpireTime"));
		resourceQuota.setSuitInfo(_ctx.stringValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SuitInfo"));
		resourceQuota.setCRMType(_ctx.stringValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.CRMType"));
		resourceQuota.setInstanceId(_ctx.stringValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.InstanceId"));

		SiteMonitorEcsProbe siteMonitorEcsProbe = new SiteMonitorEcsProbe();
		siteMonitorEcsProbe.setQuotaLimit(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SiteMonitorEcsProbe.QuotaLimit"));
		siteMonitorEcsProbe.setQuotaPackage(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SiteMonitorEcsProbe.QuotaPackage"));
		siteMonitorEcsProbe.setQuotaUsed(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SiteMonitorEcsProbe.QuotaUsed"));
		resourceQuota.setSiteMonitorEcsProbe(siteMonitorEcsProbe);

		SiteMonitorOperatorProbe siteMonitorOperatorProbe = new SiteMonitorOperatorProbe();
		siteMonitorOperatorProbe.setQuotaLimit(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SiteMonitorOperatorProbe.QuotaLimit"));
		siteMonitorOperatorProbe.setQuotaPackage(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SiteMonitorOperatorProbe.QuotaPackage"));
		siteMonitorOperatorProbe.setQuotaUsed(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SiteMonitorOperatorProbe.QuotaUsed"));
		resourceQuota.setSiteMonitorOperatorProbe(siteMonitorOperatorProbe);

		SiteMonitorTask siteMonitorTask = new SiteMonitorTask();
		siteMonitorTask.setQuotaLimit(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SiteMonitorTask.QuotaLimit"));
		siteMonitorTask.setQuotaPackage(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SiteMonitorTask.QuotaPackage"));
		siteMonitorTask.setQuotaUsed(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SiteMonitorTask.QuotaUsed"));
		resourceQuota.setSiteMonitorTask(siteMonitorTask);

		CustomMonitor customMonitor = new CustomMonitor();
		customMonitor.setQuotaLimit(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.CustomMonitor.QuotaLimit"));
		customMonitor.setQuotaPackage(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.CustomMonitor.QuotaPackage"));
		customMonitor.setQuotaUsed(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.CustomMonitor.QuotaUsed"));
		resourceQuota.setCustomMonitor(customMonitor);

		EventMonitor eventMonitor = new EventMonitor();
		eventMonitor.setQuotaLimit(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.EventMonitor.QuotaLimit"));
		eventMonitor.setQuotaPackage(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.EventMonitor.QuotaPackage"));
		eventMonitor.setQuotaUsed(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.EventMonitor.QuotaUsed"));
		resourceQuota.setEventMonitor(eventMonitor);

		LogMonitor logMonitor = new LogMonitor();
		logMonitor.setQuotaLimit(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.LogMonitor.QuotaLimit"));
		logMonitor.setQuotaPackage(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.LogMonitor.QuotaPackage"));
		logMonitor.setQuotaUsed(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.LogMonitor.QuotaUsed"));
		resourceQuota.setLogMonitor(logMonitor);

		Api api = new Api();
		api.setQuotaLimit(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.Api.QuotaLimit"));
		api.setQuotaPackage(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.Api.QuotaPackage"));
		api.setQuotaUsed(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.Api.QuotaUsed"));
		resourceQuota.setApi(api);

		SMS sMS = new SMS();
		sMS.setQuotaLimit(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SMS.QuotaLimit"));
		sMS.setQuotaPackage(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SMS.QuotaPackage"));
		sMS.setQuotaUsed(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.SMS.QuotaUsed"));
		resourceQuota.setSMS(sMS);

		Phone phone = new Phone();
		phone.setQuotaLimit(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.Phone.QuotaLimit"));
		phone.setQuotaPackage(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.Phone.QuotaPackage"));
		phone.setQuotaUsed(_ctx.integerValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.Phone.QuotaUsed"));
		resourceQuota.setPhone(phone);

		EnterpriseQuota enterpriseQuota = new EnterpriseQuota();
		enterpriseQuota.setSuitInfo(_ctx.stringValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.EnterpriseQuota.SuitInfo"));
		enterpriseQuota.setInstanceId(_ctx.stringValue("DescribeMonitorResourceQuotaAttributeResponse.ResourceQuota.EnterpriseQuota.InstanceId"));
		resourceQuota.setEnterpriseQuota(enterpriseQuota);
		describeMonitorResourceQuotaAttributeResponse.setResourceQuota(resourceQuota);
	 
	 	return describeMonitorResourceQuotaAttributeResponse;
	}
}