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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeApplianceInfoResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeApplianceInfoResponse.Cluster;
import com.aliyuncs.hbr.model.v20170908.DescribeApplianceInfoResponse.Host;
import com.aliyuncs.hbr.model.v20170908.DescribeApplianceInfoResponse.License;
import com.aliyuncs.hbr.model.v20170908.DescribeApplianceInfoResponse.Resource;
import com.aliyuncs.hbr.model.v20170908.DescribeApplianceInfoResponse.Storage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplianceInfoResponseUnmarshaller {

	public static DescribeApplianceInfoResponse unmarshall(DescribeApplianceInfoResponse describeApplianceInfoResponse, UnmarshallerContext _ctx) {
		
		describeApplianceInfoResponse.setRequestId(_ctx.stringValue("DescribeApplianceInfoResponse.RequestId"));
		describeApplianceInfoResponse.setSuccess(_ctx.booleanValue("DescribeApplianceInfoResponse.Success"));
		describeApplianceInfoResponse.setCode(_ctx.stringValue("DescribeApplianceInfoResponse.Code"));
		describeApplianceInfoResponse.setMessage(_ctx.stringValue("DescribeApplianceInfoResponse.Message"));
		describeApplianceInfoResponse.setTotalCount(_ctx.integerValue("DescribeApplianceInfoResponse.TotalCount"));
		describeApplianceInfoResponse.setPageNumber(_ctx.integerValue("DescribeApplianceInfoResponse.PageNumber"));
		describeApplianceInfoResponse.setPageSize(_ctx.integerValue("DescribeApplianceInfoResponse.PageSize"));

		List<Host> hostList = new ArrayList<Host>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplianceInfoResponse.HostList.Length"); i++) {
			Host host = new Host();
			host.setApplianceId(_ctx.stringValue("DescribeApplianceInfoResponse.HostList["+ i +"].ApplianceId"));
			host.setHostName(_ctx.stringValue("DescribeApplianceInfoResponse.HostList["+ i +"].HostName"));
			host.setIpAddress(_ctx.stringValue("DescribeApplianceInfoResponse.HostList["+ i +"].IpAddress"));
			host.setHostId(_ctx.stringValue("DescribeApplianceInfoResponse.HostList["+ i +"].HostId"));
			host.setOsType(_ctx.stringValue("DescribeApplianceInfoResponse.HostList["+ i +"].OsType"));
			host.setOsVersion(_ctx.stringValue("DescribeApplianceInfoResponse.HostList["+ i +"].OsVersion"));
			host.setStatus(_ctx.stringValue("DescribeApplianceInfoResponse.HostList["+ i +"].Status"));
			host.setAgentVersion(_ctx.stringValue("DescribeApplianceInfoResponse.HostList["+ i +"].AgentVersion"));
			host.setReportTime(_ctx.longValue("DescribeApplianceInfoResponse.HostList["+ i +"].ReportTime"));
			host.setCreatedTime(_ctx.longValue("DescribeApplianceInfoResponse.HostList["+ i +"].CreatedTime"));
			host.setUpdatedTime(_ctx.longValue("DescribeApplianceInfoResponse.HostList["+ i +"].UpdatedTime"));

			hostList.add(host);
		}
		describeApplianceInfoResponse.setHostList(hostList);

		List<Resource> resourceList = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplianceInfoResponse.ResourceList.Length"); i++) {
			Resource resource = new Resource();
			resource.setTenantName(_ctx.stringValue("DescribeApplianceInfoResponse.ResourceList["+ i +"].TenantName"));
			resource.setResourceName(_ctx.stringValue("DescribeApplianceInfoResponse.ResourceList["+ i +"].ResourceName"));
			resource.setResourceId(_ctx.stringValue("DescribeApplianceInfoResponse.ResourceList["+ i +"].ResourceId"));
			resource.setModule(_ctx.stringValue("DescribeApplianceInfoResponse.ResourceList["+ i +"].Module"));
			resource.setHostId(_ctx.stringValue("DescribeApplianceInfoResponse.ResourceList["+ i +"].HostId"));
			resource.setStatus(_ctx.stringValue("DescribeApplianceInfoResponse.ResourceList["+ i +"].Status"));
			resource.setReportTime(_ctx.longValue("DescribeApplianceInfoResponse.ResourceList["+ i +"].ReportTime"));
			resource.setCreatedTime(_ctx.longValue("DescribeApplianceInfoResponse.ResourceList["+ i +"].CreatedTime"));
			resource.setUpdatedTime(_ctx.longValue("DescribeApplianceInfoResponse.ResourceList["+ i +"].UpdatedTime"));

			resourceList.add(resource);
		}
		describeApplianceInfoResponse.setResourceList(resourceList);

		List<Cluster> clusterList = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplianceInfoResponse.ClusterList.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setTenantName(_ctx.stringValue("DescribeApplianceInfoResponse.ClusterList["+ i +"].TenantName"));
			cluster.setClusterName(_ctx.stringValue("DescribeApplianceInfoResponse.ClusterList["+ i +"].ClusterName"));
			cluster.setClusterId(_ctx.stringValue("DescribeApplianceInfoResponse.ClusterList["+ i +"].ClusterId"));
			cluster.setModule(_ctx.stringValue("DescribeApplianceInfoResponse.ClusterList["+ i +"].Module"));
			cluster.setType(_ctx.stringValue("DescribeApplianceInfoResponse.ClusterList["+ i +"].Type"));
			cluster.setNodes(_ctx.stringValue("DescribeApplianceInfoResponse.ClusterList["+ i +"].Nodes"));
			cluster.setStatus(_ctx.stringValue("DescribeApplianceInfoResponse.ClusterList["+ i +"].Status"));
			cluster.setReportTime(_ctx.longValue("DescribeApplianceInfoResponse.ClusterList["+ i +"].ReportTime"));
			cluster.setCreatedTime(_ctx.longValue("DescribeApplianceInfoResponse.ClusterList["+ i +"].CreatedTime"));
			cluster.setUpdatedTime(_ctx.longValue("DescribeApplianceInfoResponse.ClusterList["+ i +"].UpdatedTime"));

			clusterList.add(cluster);
		}
		describeApplianceInfoResponse.setClusterList(clusterList);

		List<License> licenseList = new ArrayList<License>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplianceInfoResponse.LicenseList.Length"); i++) {
			License license = new License();
			license.setLicenseId(_ctx.stringValue("DescribeApplianceInfoResponse.LicenseList["+ i +"].LicenseId"));
			license.setLicenseVersion(_ctx.stringValue("DescribeApplianceInfoResponse.LicenseList["+ i +"].LicenseVersion"));
			license.setLicenseObject(_ctx.stringValue("DescribeApplianceInfoResponse.LicenseList["+ i +"].LicenseObject"));
			license.setMode(_ctx.stringValue("DescribeApplianceInfoResponse.LicenseList["+ i +"].Mode"));
			license.setStorage(_ctx.stringValue("DescribeApplianceInfoResponse.LicenseList["+ i +"].Storage"));
			license.setExpireTime(_ctx.longValue("DescribeApplianceInfoResponse.LicenseList["+ i +"].ExpireTime"));
			license.setReportTime(_ctx.longValue("DescribeApplianceInfoResponse.LicenseList["+ i +"].ReportTime"));
			license.setCreatedTime(_ctx.longValue("DescribeApplianceInfoResponse.LicenseList["+ i +"].CreatedTime"));
			license.setUpdatedTime(_ctx.longValue("DescribeApplianceInfoResponse.LicenseList["+ i +"].UpdatedTime"));

			licenseList.add(license);
		}
		describeApplianceInfoResponse.setLicenseList(licenseList);

		List<Storage> storageList = new ArrayList<Storage>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplianceInfoResponse.StorageList.Length"); i++) {
			Storage storage = new Storage();
			storage.setTenantName(_ctx.stringValue("DescribeApplianceInfoResponse.StorageList["+ i +"].TenantName"));
			storage.setStorageName(_ctx.stringValue("DescribeApplianceInfoResponse.StorageList["+ i +"].StorageName"));
			storage.setType(_ctx.stringValue("DescribeApplianceInfoResponse.StorageList["+ i +"].Type"));
			storage.setStorageId(_ctx.stringValue("DescribeApplianceInfoResponse.StorageList["+ i +"].StorageId"));
			storage.setRetentionDays(_ctx.longValue("DescribeApplianceInfoResponse.StorageList["+ i +"].RetentionDays"));
			storage.setAvailableSize(_ctx.longValue("DescribeApplianceInfoResponse.StorageList["+ i +"].AvailableSize"));
			storage.setTotalSize(_ctx.longValue("DescribeApplianceInfoResponse.StorageList["+ i +"].TotalSize"));
			storage.setReportTime(_ctx.longValue("DescribeApplianceInfoResponse.StorageList["+ i +"].ReportTime"));
			storage.setCreatedTime(_ctx.longValue("DescribeApplianceInfoResponse.StorageList["+ i +"].CreatedTime"));
			storage.setUpdatedTime(_ctx.longValue("DescribeApplianceInfoResponse.StorageList["+ i +"].UpdatedTime"));

			storageList.add(storage);
		}
		describeApplianceInfoResponse.setStorageList(storageList);
	 
	 	return describeApplianceInfoResponse;
	}
}