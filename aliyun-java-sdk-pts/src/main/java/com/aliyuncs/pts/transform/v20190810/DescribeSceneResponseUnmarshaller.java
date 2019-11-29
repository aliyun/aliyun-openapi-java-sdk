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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.DescribeSceneResponse;
import com.aliyuncs.pts.model.v20190810.DescribeSceneResponse.Scene;
import com.aliyuncs.pts.model.v20190810.DescribeSceneResponse.Scene.File;
import com.aliyuncs.pts.model.v20190810.DescribeSceneResponse.Scene.File.ExportedParam;
import com.aliyuncs.pts.model.v20190810.DescribeSceneResponse.Scene.Relation;
import com.aliyuncs.pts.model.v20190810.DescribeSceneResponse.Scene.Relation.Node;
import com.aliyuncs.pts.model.v20190810.DescribeSceneResponse.Scene.Relation.RelationTestConfig;
import com.aliyuncs.pts.model.v20190810.DescribeSceneResponse.Scene.Status;
import com.aliyuncs.pts.model.v20190810.DescribeSceneResponse.Scene.TestConfig;
import com.aliyuncs.pts.model.v20190810.DescribeSceneResponse.Scene.TestConfig.VpcConfig;
import com.aliyuncs.pts.model.v20190810.DescribeSceneResponse.Scene.Vip;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSceneResponseUnmarshaller {

	public static DescribeSceneResponse unmarshall(DescribeSceneResponse describeSceneResponse, UnmarshallerContext _ctx) {
		
		describeSceneResponse.setRequestId(_ctx.stringValue("DescribeSceneResponse.RequestId"));
		describeSceneResponse.setCode(_ctx.stringValue("DescribeSceneResponse.Code"));
		describeSceneResponse.setMessage(_ctx.stringValue("DescribeSceneResponse.Message"));
		describeSceneResponse.setHttpStatusCode(_ctx.integerValue("DescribeSceneResponse.HttpStatusCode"));
		describeSceneResponse.setSuccess(_ctx.booleanValue("DescribeSceneResponse.Success"));

		Scene scene = new Scene();
		scene.setId(_ctx.stringValue("DescribeSceneResponse.Scene.Id"));
		scene.setName(_ctx.stringValue("DescribeSceneResponse.Scene.Name"));
		scene.setType(_ctx.stringValue("DescribeSceneResponse.Scene.Type"));
		scene.setVariables(_ctx.mapValue("DescribeSceneResponse.Scene.Variables"));
		scene.setHeaders(_ctx.mapValue("DescribeSceneResponse.Scene.Headers"));
		scene.setCreator(_ctx.stringValue("DescribeSceneResponse.Scene.Creator"));
		scene.setModifier(_ctx.stringValue("DescribeSceneResponse.Scene.Modifier"));
		scene.setCreateTime(_ctx.longValue("DescribeSceneResponse.Scene.CreateTime"));
		scene.setModifyTime(_ctx.longValue("DescribeSceneResponse.Scene.ModifyTime"));

		Status status = new Status();
		status.setOperations(_ctx.mapValue("DescribeSceneResponse.Scene.Status.Operations"));
		status.setTips(_ctx.stringValue("DescribeSceneResponse.Scene.Status.Tips"));
		status.setDebugging(_ctx.booleanValue("DescribeSceneResponse.Scene.Status.Debugging"));
		status.setTesting(_ctx.booleanValue("DescribeSceneResponse.Scene.Status.Testing"));
		status.setIsCronable(_ctx.booleanValue("DescribeSceneResponse.Scene.Status.IsCronable"));
		status.setIsReusable(_ctx.booleanValue("DescribeSceneResponse.Scene.Status.IsReusable"));
		status.setCronEditable(_ctx.booleanValue("DescribeSceneResponse.Scene.Status.CronEditable"));
		scene.setStatus(status);

		TestConfig testConfig = new TestConfig();
		testConfig.setMode(_ctx.stringValue("DescribeSceneResponse.Scene.TestConfig.Mode"));
		testConfig.setMaxDuration(_ctx.integerValue("DescribeSceneResponse.Scene.TestConfig.MaxDuration"));
		testConfig.setAutoStep(_ctx.booleanValue("DescribeSceneResponse.Scene.TestConfig.AutoStep"));
		testConfig.setIncrement(_ctx.integerValue("DescribeSceneResponse.Scene.TestConfig.Increment"));
		testConfig.setKeepTime(_ctx.integerValue("DescribeSceneResponse.Scene.TestConfig.KeepTime"));
		testConfig.setAgentPool(_ctx.stringValue("DescribeSceneResponse.Scene.TestConfig.AgentPool"));

		VpcConfig vpcConfig = new VpcConfig();
		vpcConfig.setRegionId(_ctx.stringValue("DescribeSceneResponse.Scene.TestConfig.VpcConfig.RegionId"));
		vpcConfig.setVSwitchId(_ctx.stringValue("DescribeSceneResponse.Scene.TestConfig.VpcConfig.VSwitchId"));
		vpcConfig.setSecurityGroupId(_ctx.stringValue("DescribeSceneResponse.Scene.TestConfig.VpcConfig.SecurityGroupId"));
		vpcConfig.setVpcId(_ctx.stringValue("DescribeSceneResponse.Scene.TestConfig.VpcConfig.VpcId"));
		testConfig.setVpcConfig(vpcConfig);
		scene.setTestConfig(testConfig);

		List<Relation> relations = new ArrayList<Relation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSceneResponse.Scene.Relations.Length"); i++) {
			Relation relation = new Relation();
			relation.setId(_ctx.longValue("DescribeSceneResponse.Scene.Relations["+ i +"].Id"));
			relation.setName(_ctx.stringValue("DescribeSceneResponse.Scene.Relations["+ i +"].Name"));
			relation.setDisabled(_ctx.booleanValue("DescribeSceneResponse.Scene.Relations["+ i +"].Disabled"));
			relation.setHeaders(_ctx.mapValue("DescribeSceneResponse.Scene.Relations["+ i +"].Headers"));

			RelationTestConfig relationTestConfig = new RelationTestConfig();
			relationTestConfig.setBeginStep(_ctx.integerValue("DescribeSceneResponse.Scene.Relations["+ i +"].RelationTestConfig.BeginStep"));
			relationTestConfig.setIncrement(_ctx.integerValue("DescribeSceneResponse.Scene.Relations["+ i +"].RelationTestConfig.Increment"));
			relationTestConfig.setEndStep(_ctx.integerValue("DescribeSceneResponse.Scene.Relations["+ i +"].RelationTestConfig.EndStep"));
			relation.setRelationTestConfig(relationTestConfig);

			List<Node> nodes = new ArrayList<Node>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSceneResponse.Scene.Relations["+ i +"].Nodes.Length"); j++) {
				Node node = new Node();
				node.setId(_ctx.longValue("DescribeSceneResponse.Scene.Relations["+ i +"].Nodes["+ j +"].Id"));
				node.setName(_ctx.stringValue("DescribeSceneResponse.Scene.Relations["+ i +"].Nodes["+ j +"].Name"));
				node.setType(_ctx.stringValue("DescribeSceneResponse.Scene.Relations["+ i +"].Nodes["+ j +"].Type"));
				node.setConfig(_ctx.mapValue("DescribeSceneResponse.Scene.Relations["+ i +"].Nodes["+ j +"].Config"));

				nodes.add(node);
			}
			relation.setNodes(nodes);

			relations.add(relation);
		}
		scene.setRelations(relations);

		List<Vip> vips = new ArrayList<Vip>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSceneResponse.Scene.Vips.Length"); i++) {
			Vip vip = new Vip();
			vip.setDomain(_ctx.stringValue("DescribeSceneResponse.Scene.Vips["+ i +"].Domain"));
			vip.setEnabled(_ctx.booleanValue("DescribeSceneResponse.Scene.Vips["+ i +"].Enabled"));

			List<String> ips = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSceneResponse.Scene.Vips["+ i +"].Ips.Length"); j++) {
				ips.add(_ctx.stringValue("DescribeSceneResponse.Scene.Vips["+ i +"].Ips["+ j +"]"));
			}
			vip.setIps(ips);

			vips.add(vip);
		}
		scene.setVips(vips);

		List<File> files = new ArrayList<File>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSceneResponse.Scene.Files.Length"); i++) {
			File file = new File();
			file.setFileKey(_ctx.stringValue("DescribeSceneResponse.Scene.Files["+ i +"].FileKey"));
			file.setFileName(_ctx.stringValue("DescribeSceneResponse.Scene.Files["+ i +"].FileName"));
			file.setSkipFirstLine(_ctx.booleanValue("DescribeSceneResponse.Scene.Files["+ i +"].SkipFirstLine"));
			file.setPreviewData(_ctx.mapValue("DescribeSceneResponse.Scene.Files["+ i +"].PreviewData"));
			file.setRemoteUrl(_ctx.stringValue("DescribeSceneResponse.Scene.Files["+ i +"].RemoteUrl"));

			List<ExportedParam> exportedParams = new ArrayList<ExportedParam>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSceneResponse.Scene.Files["+ i +"].ExportedParams.Length"); j++) {
				ExportedParam exportedParam = new ExportedParam();
				exportedParam.setName(_ctx.stringValue("DescribeSceneResponse.Scene.Files["+ i +"].ExportedParams["+ j +"].Name"));
				exportedParam.setColumn(_ctx.stringValue("DescribeSceneResponse.Scene.Files["+ i +"].ExportedParams["+ j +"].Column"));

				exportedParams.add(exportedParam);
			}
			file.setExportedParams(exportedParams);

			files.add(file);
		}
		scene.setFiles(files);
		describeSceneResponse.setScene(scene);
	 
	 	return describeSceneResponse;
	}
}