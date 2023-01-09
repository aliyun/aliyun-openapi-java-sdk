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

package com.aliyuncs.pts.transform.v20201020;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20201020.GetOpenJMeterSceneResponse;
import com.aliyuncs.pts.model.v20201020.GetOpenJMeterSceneResponse.Scene;
import com.aliyuncs.pts.model.v20201020.GetOpenJMeterSceneResponse.Scene.BaseInfo;
import com.aliyuncs.pts.model.v20201020.GetOpenJMeterSceneResponse.Scene.DnsCacheConfig;
import com.aliyuncs.pts.model.v20201020.GetOpenJMeterSceneResponse.Scene.FileListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOpenJMeterSceneResponseUnmarshaller {

	public static GetOpenJMeterSceneResponse unmarshall(GetOpenJMeterSceneResponse getOpenJMeterSceneResponse, UnmarshallerContext _ctx) {
		
		getOpenJMeterSceneResponse.setRequestId(_ctx.stringValue("GetOpenJMeterSceneResponse.RequestId"));
		getOpenJMeterSceneResponse.setMessage(_ctx.stringValue("GetOpenJMeterSceneResponse.Message"));
		getOpenJMeterSceneResponse.setHttpStatusCode(_ctx.integerValue("GetOpenJMeterSceneResponse.HttpStatusCode"));
		getOpenJMeterSceneResponse.setCode(_ctx.stringValue("GetOpenJMeterSceneResponse.Code"));
		getOpenJMeterSceneResponse.setSuccess(_ctx.booleanValue("GetOpenJMeterSceneResponse.Success"));

		Scene scene = new Scene();
		scene.setSceneName(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.SceneName"));
		scene.setSceneId(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.SceneId"));
		scene.setEnvironmentId(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.EnvironmentId"));
		scene.setTestFile(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.TestFile"));
		scene.setIsVpcTest(_ctx.booleanValue("GetOpenJMeterSceneResponse.Scene.IsVpcTest"));
		scene.setDuration(_ctx.integerValue("GetOpenJMeterSceneResponse.Scene.Duration"));
		scene.setConcurrency(_ctx.integerValue("GetOpenJMeterSceneResponse.Scene.Concurrency"));
		scene.setAgentCount(_ctx.integerValue("GetOpenJMeterSceneResponse.Scene.AgentCount"));
		scene.setRampUp(_ctx.integerValue("GetOpenJMeterSceneResponse.Scene.RampUp"));
		scene.setSteps(_ctx.integerValue("GetOpenJMeterSceneResponse.Scene.Steps"));
		scene.setRegionId(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.RegionId"));
		scene.setVpcId(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.VpcId"));
		scene.setSecurityGroupId(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.SecurityGroupId"));
		scene.setVSwitchId(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.VSwitchId"));
		scene.setSyncTimerType(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.SyncTimerType"));
		scene.setConstantThroughputTimerType(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.ConstantThroughputTimerType"));
		scene.setPool(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.Pool"));
		scene.setMode(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.Mode"));
		scene.setStartRps(_ctx.integerValue("GetOpenJMeterSceneResponse.Scene.StartRps"));
		scene.setMaxRps(_ctx.integerValue("GetOpenJMeterSceneResponse.Scene.MaxRps"));
		scene.setStartConcurrency(_ctx.integerValue("GetOpenJMeterSceneResponse.Scene.StartConcurrency"));

		BaseInfo baseInfo = new BaseInfo();
		baseInfo.setRemark(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.BaseInfo.Remark"));
		baseInfo.setPrincipal(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.BaseInfo.Principal"));
		baseInfo.setResource(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.BaseInfo.Resource"));
		baseInfo.setCreateName(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.BaseInfo.CreateName"));
		baseInfo.setModifyName(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.BaseInfo.ModifyName"));
		baseInfo.setOperateType(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.BaseInfo.OperateType"));
		scene.setBaseInfo(baseInfo);

		DnsCacheConfig dnsCacheConfig = new DnsCacheConfig();
		dnsCacheConfig.setClearCacheEachIteration(_ctx.booleanValue("GetOpenJMeterSceneResponse.Scene.DnsCacheConfig.ClearCacheEachIteration"));
		dnsCacheConfig.setHostTable(_ctx.mapValue("GetOpenJMeterSceneResponse.Scene.DnsCacheConfig.HostTable"));

		List<String> dnsServers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOpenJMeterSceneResponse.Scene.DnsCacheConfig.DnsServers.Length"); i++) {
			dnsServers.add(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.DnsCacheConfig.DnsServers["+ i +"]"));
		}
		dnsCacheConfig.setDnsServers(dnsServers);
		scene.setDnsCacheConfig(dnsCacheConfig);

		List<FileListItem> fileList = new ArrayList<FileListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOpenJMeterSceneResponse.Scene.FileList.Length"); i++) {
			FileListItem fileListItem = new FileListItem();
			fileListItem.setId(_ctx.longValue("GetOpenJMeterSceneResponse.Scene.FileList["+ i +"].Id"));
			fileListItem.setFileName(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.FileList["+ i +"].FileName"));
			fileListItem.setFileOssAddress(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.FileList["+ i +"].FileOssAddress"));
			fileListItem.setSplitCsv(_ctx.booleanValue("GetOpenJMeterSceneResponse.Scene.FileList["+ i +"].SplitCsv"));
			fileListItem.setMd5(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.FileList["+ i +"].Md5"));
			fileListItem.setFileSize(_ctx.longValue("GetOpenJMeterSceneResponse.Scene.FileList["+ i +"].FileSize"));
			fileListItem.setFileType(_ctx.stringValue("GetOpenJMeterSceneResponse.Scene.FileList["+ i +"].FileType"));

			fileList.add(fileListItem);
		}
		scene.setFileList(fileList);
		getOpenJMeterSceneResponse.setScene(scene);
	 
	 	return getOpenJMeterSceneResponse;
	}
}