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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.GetK8sApplicationResponse;
import com.aliyuncs.edas.model.v20170801.GetK8sApplicationResponse.Applcation;
import com.aliyuncs.edas.model.v20170801.GetK8sApplicationResponse.Applcation.App;
import com.aliyuncs.edas.model.v20170801.GetK8sApplicationResponse.Applcation.App.Env;
import com.aliyuncs.edas.model.v20170801.GetK8sApplicationResponse.Applcation.Conf;
import com.aliyuncs.edas.model.v20170801.GetK8sApplicationResponse.Applcation.DeployGroup;
import com.aliyuncs.edas.model.v20170801.GetK8sApplicationResponse.Applcation.DeployGroup.ComponentsItem;
import com.aliyuncs.edas.model.v20170801.GetK8sApplicationResponse.Applcation.ImageInfo;
import com.aliyuncs.edas.model.v20170801.GetK8sApplicationResponse.Applcation.LatestVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetK8sApplicationResponseUnmarshaller {

	public static GetK8sApplicationResponse unmarshall(GetK8sApplicationResponse getK8sApplicationResponse, UnmarshallerContext _ctx) {
		
		getK8sApplicationResponse.setRequestId(_ctx.stringValue("GetK8sApplicationResponse.RequestId"));
		getK8sApplicationResponse.setCode(_ctx.integerValue("GetK8sApplicationResponse.Code"));
		getK8sApplicationResponse.setMessage(_ctx.stringValue("GetK8sApplicationResponse.Message"));

		Applcation applcation = new Applcation();
		applcation.setAppId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.AppId"));

		ImageInfo imageInfo = new ImageInfo();
		imageInfo.setRepoId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.ImageInfo.RepoId"));
		imageInfo.setImageUrl(_ctx.stringValue("GetK8sApplicationResponse.Applcation.ImageInfo.ImageUrl"));
		imageInfo.setRepoOriginType(_ctx.stringValue("GetK8sApplicationResponse.Applcation.ImageInfo.RepoOriginType"));
		imageInfo.setTag(_ctx.stringValue("GetK8sApplicationResponse.Applcation.ImageInfo.Tag"));
		imageInfo.setRepoName(_ctx.stringValue("GetK8sApplicationResponse.Applcation.ImageInfo.RepoName"));
		imageInfo.setRepoNamespace(_ctx.stringValue("GetK8sApplicationResponse.Applcation.ImageInfo.RepoNamespace"));
		imageInfo.setRegionId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.ImageInfo.RegionId"));
		applcation.setImageInfo(imageInfo);

		App app = new App();
		app.setRequestMem(_ctx.integerValue("GetK8sApplicationResponse.Applcation.App.RequestMem"));
		app.setInstancesBeforeScaling(_ctx.integerValue("GetK8sApplicationResponse.Applcation.App.InstancesBeforeScaling"));
		app.setDeployType(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.DeployType"));
		app.setApplicationName(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.ApplicationName"));
		app.setApplicationType(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.ApplicationType"));
		app.setInstances(_ctx.integerValue("GetK8sApplicationResponse.Applcation.App.Instances"));
		app.setLimitMem(_ctx.integerValue("GetK8sApplicationResponse.Applcation.App.LimitMem"));
		app.setCmd(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.Cmd"));
		app.setRegionId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.RegionId"));
		app.setBuildpackId(_ctx.integerValue("GetK8sApplicationResponse.Applcation.App.BuildpackId"));
		app.setTomcatVersion(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.TomcatVersion"));
		app.setCsClusterId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.CsClusterId"));
		app.setRequestCpuM(_ctx.integerValue("GetK8sApplicationResponse.Applcation.App.RequestCpuM"));
		app.setAppId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.AppId"));
		app.setK8sNamespace(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.K8sNamespace"));
		app.setEdasContainerVersion(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.EdasContainerVersion"));
		app.setLimitCpuM(_ctx.integerValue("GetK8sApplicationResponse.Applcation.App.LimitCpuM"));
		app.setClusterId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.ClusterId"));

		List<String> cmdArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetK8sApplicationResponse.Applcation.App.CmdArgs.Length"); i++) {
			cmdArgs.add(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.CmdArgs["+ i +"]"));
		}
		app.setCmdArgs(cmdArgs);

		List<Env> envList = new ArrayList<Env>();
		for (int i = 0; i < _ctx.lengthValue("GetK8sApplicationResponse.Applcation.App.EnvList.Length"); i++) {
			Env env = new Env();
			env.setName(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.EnvList["+ i +"].Name"));
			env.setValue(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.EnvList["+ i +"].Value"));

			envList.add(env);
		}
		app.setEnvList(envList);
		applcation.setApp(app);

		Conf conf = new Conf();
		conf.setPostStart(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.PostStart"));
		conf.setReadiness(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.Readiness"));
		conf.setAhasEnabled(_ctx.booleanValue("GetK8sApplicationResponse.Applcation.Conf.AhasEnabled"));
		conf.setK8sCmdArgs(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.K8sCmdArgs"));
		conf.setLiveness(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.Liveness"));
		conf.setDeployAcrossNodes(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.DeployAcrossNodes"));
		conf.setK8sCmd(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.K8sCmd"));
		conf.setPreStop(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.PreStop"));
		conf.setDeployAcrossZones(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.DeployAcrossZones"));
		conf.setJarStartArgs(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.JarStartArgs"));
		conf.setK8sNasInfo(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.K8sNasInfo"));
		conf.setJarStartOptions(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.JarStartOptions"));
		conf.setRuntimeClassName(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.RuntimeClassName"));
		conf.setK8sLocalvolumeInfo(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.K8sLocalvolumeInfo"));
		conf.setK8sVolumeInfo(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.K8sVolumeInfo"));
		conf.setAffinity(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.Affinity"));
		conf.setTolerations(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.Tolerations"));
		applcation.setConf(conf);

		LatestVersion latestVersion = new LatestVersion();
		latestVersion.setUrl(_ctx.stringValue("GetK8sApplicationResponse.Applcation.LatestVersion.Url"));
		latestVersion.setWarUrl(_ctx.stringValue("GetK8sApplicationResponse.Applcation.LatestVersion.WarUrl"));
		latestVersion.setPackageVersion(_ctx.stringValue("GetK8sApplicationResponse.Applcation.LatestVersion.PackageVersion"));
		applcation.setLatestVersion(latestVersion);

		List<DeployGroup> deployGroups = new ArrayList<DeployGroup>();
		for (int i = 0; i < _ctx.lengthValue("GetK8sApplicationResponse.Applcation.DeployGroups.Length"); i++) {
			DeployGroup deployGroup = new DeployGroup();

			List<ComponentsItem> components = new ArrayList<ComponentsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetK8sApplicationResponse.Applcation.DeployGroups["+ i +"].Components.Length"); j++) {
				ComponentsItem componentsItem = new ComponentsItem();
				componentsItem.setType(_ctx.stringValue("GetK8sApplicationResponse.Applcation.DeployGroups["+ i +"].Components["+ j +"].Type"));
				componentsItem.setComponentKey(_ctx.stringValue("GetK8sApplicationResponse.Applcation.DeployGroups["+ i +"].Components["+ j +"].ComponentKey"));
				componentsItem.setComponentId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.DeployGroups["+ i +"].Components["+ j +"].ComponentId"));

				components.add(componentsItem);
			}
			deployGroup.setComponents(components);

			deployGroups.add(deployGroup);
		}
		applcation.setDeployGroups(deployGroups);
		getK8sApplicationResponse.setApplcation(applcation);
	 
	 	return getK8sApplicationResponse;
	}
}