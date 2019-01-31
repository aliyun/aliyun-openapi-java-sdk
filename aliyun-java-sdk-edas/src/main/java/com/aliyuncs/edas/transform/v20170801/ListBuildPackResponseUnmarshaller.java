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

import com.aliyuncs.edas.model.v20170801.ListBuildPackResponse;
import com.aliyuncs.edas.model.v20170801.ListBuildPackResponse.BuildPack;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBuildPackResponseUnmarshaller {

	public static ListBuildPackResponse unmarshall(ListBuildPackResponse listBuildPackResponse, UnmarshallerContext context) {
		
		listBuildPackResponse.setRequestId(context.stringValue("ListBuildPackResponse.RequestId"));
		listBuildPackResponse.setCode(context.integerValue("ListBuildPackResponse.Code"));
		listBuildPackResponse.setMessage(context.stringValue("ListBuildPackResponse.Message"));

		List<BuildPack> buildPackList = new ArrayList<BuildPack>();
		for (int i = 0; i < context.lengthValue("ListBuildPackResponse.BuildPackList.Length"); i++) {
			BuildPack buildPack = new BuildPack();
			buildPack.setConfigId(context.longValue("ListBuildPackResponse.BuildPackList["+ i +"].ConfigId"));
			buildPack.setPackVersion(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].PackVersion"));
			buildPack.setTomcatDesc(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].TomcatDesc"));
			buildPack.setTomcatVersion(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].TomcatVersion"));
			buildPack.setTomcatDownloadUrl(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].TomcatDownloadUrl"));
			buildPack.setPandoraVersion(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].PandoraVersion"));
			buildPack.setPandoraDownloadUrl(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].PandoraDownloadUrl"));
			buildPack.setPandoraDesc(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].PandoraDesc"));
			buildPack.setPluginInfo(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].PluginInfo"));
			buildPack.setTomcatPath(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].TomcatPath"));
			buildPack.setImageId(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].ImageId"));
			buildPack.setTengineImageId(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].TengineImageId"));
			buildPack.setMultipleTenant(context.booleanValue("ListBuildPackResponse.BuildPackList["+ i +"].MultipleTenant"));
			buildPack.setWithTengine(context.booleanValue("ListBuildPackResponse.BuildPackList["+ i +"].WithTengine"));
			buildPack.setTengineDownloadUrl(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].TengineDownloadUrl"));
			buildPack.setScriptName(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].ScriptName"));
			buildPack.setScriptVersion(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].ScriptVersion"));
			buildPack.setFeature(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].Feature"));
			buildPack.setSupportFeatures(context.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].SupportFeatures"));
			buildPack.setDisabled(context.booleanValue("ListBuildPackResponse.BuildPackList["+ i +"].Disabled"));

			buildPackList.add(buildPack);
		}
		listBuildPackResponse.setBuildPackList(buildPackList);
	 
	 	return listBuildPackResponse;
	}
}