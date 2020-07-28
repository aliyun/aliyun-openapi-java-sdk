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
import com.aliyuncs.transform.UnmarshallerContext;


public class GetK8sApplicationResponseUnmarshaller {

	public static GetK8sApplicationResponse unmarshall(GetK8sApplicationResponse getK8sApplicationResponse, UnmarshallerContext _ctx) {
		
		getK8sApplicationResponse.setRequestId(_ctx.stringValue("GetK8sApplicationResponse.RequestId"));
		getK8sApplicationResponse.setCode(_ctx.integerValue("GetK8sApplicationResponse.Code"));
		getK8sApplicationResponse.setMessage(_ctx.stringValue("GetK8sApplicationResponse.Message"));

		Applcation applcation = new Applcation();
		applcation.setAppId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.AppId"));

		ImageInfo imageInfo = new ImageInfo();
		imageInfo.setImageUrl(_ctx.stringValue("GetK8sApplicationResponse.Applcation.ImageInfo.ImageUrl"));
		imageInfo.setRepoName(_ctx.stringValue("GetK8sApplicationResponse.Applcation.ImageInfo.RepoName"));
		imageInfo.setRegionId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.ImageInfo.RegionId"));
		imageInfo.setRepoId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.ImageInfo.RepoId"));
		imageInfo.setRepoNamespace(_ctx.stringValue("GetK8sApplicationResponse.Applcation.ImageInfo.RepoNamespace"));
		imageInfo.setRepoOriginType(_ctx.stringValue("GetK8sApplicationResponse.Applcation.ImageInfo.RepoOriginType"));
		imageInfo.setTag(_ctx.stringValue("GetK8sApplicationResponse.Applcation.ImageInfo.Tag"));
		applcation.setImageInfo(imageInfo);

		App app = new App();
		app.setApplicationType(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.ApplicationType"));
		app.setCmd(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.Cmd"));
		app.setDeployType(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.DeployType"));
		app.setEdasContainerVersion(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.EdasContainerVersion"));
		app.setBuildpackId(_ctx.integerValue("GetK8sApplicationResponse.Applcation.App.BuildpackId"));
		app.setTomcatVersion(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.TomcatVersion"));
		app.setInstancesBeforeScaling(_ctx.integerValue("GetK8sApplicationResponse.Applcation.App.InstancesBeforeScaling"));
		app.setAppId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.AppId"));
		app.setApplicationName(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.ApplicationName"));
		app.setClusterId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.ClusterId"));
		app.setInstances(_ctx.integerValue("GetK8sApplicationResponse.Applcation.App.Instances"));
		app.setCsClusterId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.App.CsClusterId"));

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
		conf.setJarStartArgs(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.JarStartArgs"));
		conf.setJarStartOptions(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.JarStartOptions"));
		conf.setK8sCmd(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.K8sCmd"));
		conf.setK8sCmdArgs(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.K8sCmdArgs"));
		conf.setK8sLocalvolumeInfo(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.K8sLocalvolumeInfo"));
		conf.setK8sNasInfo(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.K8sNasInfo"));
		conf.setK8sVolumeInfo(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.K8sVolumeInfo"));
		conf.setLiveness(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.Liveness"));
		conf.setPostStart(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.PostStart"));
		conf.setPreStop(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.PreStop"));
		conf.setReadiness(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.Readiness"));
		conf.setRuntimeClassName(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.RuntimeClassName"));
		conf.setDeployAcrossZones(_ctx.stringValue("GetK8sApplicationResponse.Applcation.Conf.DeployAcrossZones"));
		conf.setAhasEnabled(_ctx.booleanValue("GetK8sApplicationResponse.Applcation.Conf.AhasEnabled"));
		applcation.setConf(conf);

		List<DeployGroup> deployGroups = new ArrayList<DeployGroup>();
		for (int i = 0; i < _ctx.lengthValue("GetK8sApplicationResponse.Applcation.DeployGroups.Length"); i++) {
			DeployGroup deployGroup = new DeployGroup();

			List<ComponentsItem> components = new ArrayList<ComponentsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetK8sApplicationResponse.Applcation.DeployGroups["+ i +"].Components.Length"); j++) {
				ComponentsItem componentsItem = new ComponentsItem();
				componentsItem.setComponentId(_ctx.stringValue("GetK8sApplicationResponse.Applcation.DeployGroups["+ i +"].Components["+ j +"].ComponentId"));
				componentsItem.setComponentKey(_ctx.stringValue("GetK8sApplicationResponse.Applcation.DeployGroups["+ i +"].Components["+ j +"].ComponentKey"));

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