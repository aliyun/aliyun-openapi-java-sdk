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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeApplicationAttributeResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationAttributeResponse.Component;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationAttributeResponse.Component.SecurityGroup3;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationAttributeResponse.Component.SecurityIPArray4;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationAttributeResponse.Component.Topology;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationAttributeResponse.Endpoint;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationAttributeResponse.SecurityGroup;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationAttributeResponse.SecurityIPArray;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationAttributeResponseUnmarshaller {

	public static DescribeApplicationAttributeResponse unmarshall(DescribeApplicationAttributeResponse describeApplicationAttributeResponse, UnmarshallerContext _ctx) {
		
		describeApplicationAttributeResponse.setRequestId(_ctx.stringValue("DescribeApplicationAttributeResponse.RequestId"));
		describeApplicationAttributeResponse.setApplicationId(_ctx.stringValue("DescribeApplicationAttributeResponse.ApplicationId"));
		describeApplicationAttributeResponse.setDBClusterId(_ctx.stringValue("DescribeApplicationAttributeResponse.DBClusterId"));
		describeApplicationAttributeResponse.setArchitecture(_ctx.stringValue("DescribeApplicationAttributeResponse.Architecture"));
		describeApplicationAttributeResponse.setDescription(_ctx.stringValue("DescribeApplicationAttributeResponse.Description"));
		describeApplicationAttributeResponse.setStatus(_ctx.stringValue("DescribeApplicationAttributeResponse.Status"));
		describeApplicationAttributeResponse.setLockMode(_ctx.stringValue("DescribeApplicationAttributeResponse.LockMode"));
		describeApplicationAttributeResponse.setApplicationType(_ctx.stringValue("DescribeApplicationAttributeResponse.ApplicationType"));
		describeApplicationAttributeResponse.setVersion(_ctx.stringValue("DescribeApplicationAttributeResponse.Version"));
		describeApplicationAttributeResponse.setUpgradeAvailable(_ctx.stringValue("DescribeApplicationAttributeResponse.UpgradeAvailable"));
		describeApplicationAttributeResponse.setMaintainStartTime(_ctx.stringValue("DescribeApplicationAttributeResponse.MaintainStartTime"));
		describeApplicationAttributeResponse.setMaintainEndTime(_ctx.stringValue("DescribeApplicationAttributeResponse.MaintainEndTime"));
		describeApplicationAttributeResponse.setPayType(_ctx.stringValue("DescribeApplicationAttributeResponse.PayType"));
		describeApplicationAttributeResponse.setExpired(_ctx.booleanValue("DescribeApplicationAttributeResponse.Expired"));
		describeApplicationAttributeResponse.setVPCId(_ctx.stringValue("DescribeApplicationAttributeResponse.VPCId"));
		describeApplicationAttributeResponse.setVSwitchId(_ctx.stringValue("DescribeApplicationAttributeResponse.VSwitchId"));
		describeApplicationAttributeResponse.setCreationTime(_ctx.stringValue("DescribeApplicationAttributeResponse.CreationTime"));
		describeApplicationAttributeResponse.setExpireTime(_ctx.stringValue("DescribeApplicationAttributeResponse.ExpireTime"));
		describeApplicationAttributeResponse.setRegionId(_ctx.stringValue("DescribeApplicationAttributeResponse.RegionId"));
		describeApplicationAttributeResponse.setZoneId(_ctx.stringValue("DescribeApplicationAttributeResponse.ZoneId"));
		describeApplicationAttributeResponse.setPolarFSInstanceId(_ctx.stringValue("DescribeApplicationAttributeResponse.PolarFSInstanceId"));
		describeApplicationAttributeResponse.setServerlessType(_ctx.stringValue("DescribeApplicationAttributeResponse.ServerlessType"));
		describeApplicationAttributeResponse.setCategory(_ctx.stringValue("DescribeApplicationAttributeResponse.Category"));

		List<SecurityGroup> securityGroups = new ArrayList<SecurityGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationAttributeResponse.SecurityGroups.Length"); i++) {
			SecurityGroup securityGroup = new SecurityGroup();
			securityGroup.setSecurityGroupName(_ctx.stringValue("DescribeApplicationAttributeResponse.SecurityGroups["+ i +"].SecurityGroupName"));
			securityGroup.setSecurityGroupId(_ctx.stringValue("DescribeApplicationAttributeResponse.SecurityGroups["+ i +"].SecurityGroupId"));
			securityGroup.setRegionId(_ctx.stringValue("DescribeApplicationAttributeResponse.SecurityGroups["+ i +"].RegionId"));
			securityGroup.setNetType(_ctx.stringValue("DescribeApplicationAttributeResponse.SecurityGroups["+ i +"].NetType"));

			securityGroups.add(securityGroup);
		}
		describeApplicationAttributeResponse.setSecurityGroups(securityGroups);

		List<SecurityIPArray> securityIPArrays = new ArrayList<SecurityIPArray>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationAttributeResponse.SecurityIPArrays.Length"); i++) {
			SecurityIPArray securityIPArray = new SecurityIPArray();
			securityIPArray.setSecurityIPArrayTag(_ctx.stringValue("DescribeApplicationAttributeResponse.SecurityIPArrays["+ i +"].SecurityIPArrayTag"));
			securityIPArray.setSecurityIPType(_ctx.stringValue("DescribeApplicationAttributeResponse.SecurityIPArrays["+ i +"].SecurityIPType"));
			securityIPArray.setSecurityIPList(_ctx.stringValue("DescribeApplicationAttributeResponse.SecurityIPArrays["+ i +"].SecurityIPList"));
			securityIPArray.setSecurityIPArrayName(_ctx.stringValue("DescribeApplicationAttributeResponse.SecurityIPArrays["+ i +"].SecurityIPArrayName"));
			securityIPArray.setSecurityIPNetType(_ctx.stringValue("DescribeApplicationAttributeResponse.SecurityIPArrays["+ i +"].SecurityIPNetType"));

			securityIPArrays.add(securityIPArray);
		}
		describeApplicationAttributeResponse.setSecurityIPArrays(securityIPArrays);

		List<Component> components = new ArrayList<Component>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationAttributeResponse.Components.Length"); i++) {
			Component component = new Component();
			component.setStatus(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].Status"));
			component.setComponentType(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].ComponentType"));
			component.setComponentClassDescription(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].ComponentClassDescription"));
			component.setComponentId(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].ComponentId"));
			component.setComponentClass(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].ComponentClass"));
			component.setComponentReplica(_ctx.longValue("DescribeApplicationAttributeResponse.Components["+ i +"].ComponentReplica"));
			component.setComponentMaxReplica(_ctx.longValue("DescribeApplicationAttributeResponse.Components["+ i +"].ComponentMaxReplica"));
			component.setComponentReplicaGroupName(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].ComponentReplicaGroupName"));

			Topology topology = new Topology();
			topology.setLayer(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].Topology.Layer"));

			List<String> parents = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApplicationAttributeResponse.Components["+ i +"].Topology.Parents.Length"); j++) {
				parents.add(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].Topology.Parents["+ j +"]"));
			}
			topology.setParents(parents);

			List<String> children = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApplicationAttributeResponse.Components["+ i +"].Topology.Children.Length"); j++) {
				children.add(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].Topology.Children["+ j +"]"));
			}
			topology.setChildren(children);
			component.setTopology(topology);

			List<SecurityGroup3> securityGroups1 = new ArrayList<SecurityGroup3>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApplicationAttributeResponse.Components["+ i +"].SecurityGroups.Length"); j++) {
				SecurityGroup3 securityGroup3 = new SecurityGroup3();
				securityGroup3.setSecurityGroupName(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].SecurityGroups["+ j +"].SecurityGroupName"));
				securityGroup3.setSecurityGroupId(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].SecurityGroups["+ j +"].SecurityGroupId"));
				securityGroup3.setRegionId(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].SecurityGroups["+ j +"].RegionId"));
				securityGroup3.setNetType(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].SecurityGroups["+ j +"].NetType"));

				securityGroups1.add(securityGroup3);
			}
			component.setSecurityGroups1(securityGroups1);

			List<SecurityIPArray4> securityIPArrays2 = new ArrayList<SecurityIPArray4>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApplicationAttributeResponse.Components["+ i +"].SecurityIPArrays.Length"); j++) {
				SecurityIPArray4 securityIPArray4 = new SecurityIPArray4();
				securityIPArray4.setSecurityIPArrayTag(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].SecurityIPArrays["+ j +"].SecurityIPArrayTag"));
				securityIPArray4.setSecurityIPType(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].SecurityIPArrays["+ j +"].SecurityIPType"));
				securityIPArray4.setSecurityIPList(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].SecurityIPArrays["+ j +"].SecurityIPList"));
				securityIPArray4.setSecurityIPArrayName(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].SecurityIPArrays["+ j +"].SecurityIPArrayName"));
				securityIPArray4.setSecurityIPNetType(_ctx.stringValue("DescribeApplicationAttributeResponse.Components["+ i +"].SecurityIPArrays["+ j +"].SecurityIPNetType"));

				securityIPArrays2.add(securityIPArray4);
			}
			component.setSecurityIPArrays2(securityIPArrays2);

			components.add(component);
		}
		describeApplicationAttributeResponse.setComponents(components);

		List<Endpoint> endpoints = new ArrayList<Endpoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationAttributeResponse.Endpoints.Length"); i++) {
			Endpoint endpoint = new Endpoint();
			endpoint.setDescription(_ctx.stringValue("DescribeApplicationAttributeResponse.Endpoints["+ i +"].Description"));
			endpoint.setPortDescription(_ctx.stringValue("DescribeApplicationAttributeResponse.Endpoints["+ i +"].PortDescription"));
			endpoint.setEndpointId(_ctx.stringValue("DescribeApplicationAttributeResponse.Endpoints["+ i +"].EndpointId"));
			endpoint.setIP(_ctx.stringValue("DescribeApplicationAttributeResponse.Endpoints["+ i +"].IP"));
			endpoint.setPort(_ctx.stringValue("DescribeApplicationAttributeResponse.Endpoints["+ i +"].Port"));
			endpoint.setNetType(_ctx.stringValue("DescribeApplicationAttributeResponse.Endpoints["+ i +"].NetType"));

			endpoints.add(endpoint);
		}
		describeApplicationAttributeResponse.setEndpoints(endpoints);
	 
	 	return describeApplicationAttributeResponse;
	}
}