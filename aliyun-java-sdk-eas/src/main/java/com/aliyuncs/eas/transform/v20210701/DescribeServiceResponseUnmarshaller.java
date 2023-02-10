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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.DescribeServiceResponse;
import com.aliyuncs.eas.model.v20210701.DescribeServiceResponse.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServiceResponseUnmarshaller {

	public static DescribeServiceResponse unmarshall(DescribeServiceResponse describeServiceResponse, UnmarshallerContext _ctx) {
		
		describeServiceResponse.setRequestId(_ctx.stringValue("DescribeServiceResponse.RequestId"));
		describeServiceResponse.setRegion(_ctx.stringValue("DescribeServiceResponse.Region"));
		describeServiceResponse.setCallerUid(_ctx.stringValue("DescribeServiceResponse.CallerUid"));
		describeServiceResponse.setParentUid(_ctx.stringValue("DescribeServiceResponse.ParentUid"));
		describeServiceResponse.setCurrentVersion(_ctx.integerValue("DescribeServiceResponse.CurrentVersion"));
		describeServiceResponse.setCpu(_ctx.integerValue("DescribeServiceResponse.Cpu"));
		describeServiceResponse.setGpu(_ctx.integerValue("DescribeServiceResponse.Gpu"));
		describeServiceResponse.setImage(_ctx.stringValue("DescribeServiceResponse.Image"));
		describeServiceResponse.setPendingInstance(_ctx.integerValue("DescribeServiceResponse.PendingInstance"));
		describeServiceResponse.setRunningInstance(_ctx.integerValue("DescribeServiceResponse.RunningInstance"));
		describeServiceResponse.setTotalInstance(_ctx.integerValue("DescribeServiceResponse.TotalInstance"));
		describeServiceResponse.setInternetEndpoint(_ctx.stringValue("DescribeServiceResponse.InternetEndpoint"));
		describeServiceResponse.setIntranetEndpoint(_ctx.stringValue("DescribeServiceResponse.IntranetEndpoint"));
		describeServiceResponse.setLatestVersion(_ctx.integerValue("DescribeServiceResponse.LatestVersion"));
		describeServiceResponse.setMemory(_ctx.integerValue("DescribeServiceResponse.Memory"));
		describeServiceResponse.setMessage(_ctx.stringValue("DescribeServiceResponse.Message"));
		describeServiceResponse.setNamespace(_ctx.stringValue("DescribeServiceResponse.Namespace"));
		describeServiceResponse.setReason(_ctx.stringValue("DescribeServiceResponse.Reason"));
		describeServiceResponse.setResource(_ctx.stringValue("DescribeServiceResponse.Resource"));
		describeServiceResponse.setResourceAlias(_ctx.stringValue("DescribeServiceResponse.ResourceAlias"));
		describeServiceResponse.setServiceConfig(_ctx.stringValue("DescribeServiceResponse.ServiceConfig"));
		describeServiceResponse.setServiceName(_ctx.stringValue("DescribeServiceResponse.ServiceName"));
		describeServiceResponse.setServiceGroup(_ctx.stringValue("DescribeServiceResponse.ServiceGroup"));
		describeServiceResponse.setStatus(_ctx.stringValue("DescribeServiceResponse.Status"));
		describeServiceResponse.setCreateTime(_ctx.stringValue("DescribeServiceResponse.CreateTime"));
		describeServiceResponse.setUpdateTime(_ctx.stringValue("DescribeServiceResponse.UpdateTime"));
		describeServiceResponse.setWeight(_ctx.integerValue("DescribeServiceResponse.Weight"));
		describeServiceResponse.setServiceId(_ctx.stringValue("DescribeServiceResponse.ServiceId"));
		describeServiceResponse.setServiceUid(_ctx.stringValue("DescribeServiceResponse.ServiceUid"));
		describeServiceResponse.setAccessToken(_ctx.stringValue("DescribeServiceResponse.AccessToken"));
		describeServiceResponse.setSource(_ctx.stringValue("DescribeServiceResponse.Source"));
		describeServiceResponse.setExtraData(_ctx.stringValue("DescribeServiceResponse.ExtraData"));
		describeServiceResponse.setRole(_ctx.stringValue("DescribeServiceResponse.Role"));
		describeServiceResponse.setRoleAttrs(_ctx.stringValue("DescribeServiceResponse.RoleAttrs"));
		describeServiceResponse.setSafetyLock(_ctx.stringValue("DescribeServiceResponse.SafetyLock"));

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceResponse.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setLabelKey(_ctx.stringValue("DescribeServiceResponse.Labels["+ i +"].LabelKey"));
			labelsItem.setLabelValue(_ctx.stringValue("DescribeServiceResponse.Labels["+ i +"].LabelValue"));

			labels.add(labelsItem);
		}
		describeServiceResponse.setLabels(labels);
	 
	 	return describeServiceResponse;
	}
}