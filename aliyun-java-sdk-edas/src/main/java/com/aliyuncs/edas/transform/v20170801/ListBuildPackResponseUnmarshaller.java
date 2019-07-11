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

	public static ListBuildPackResponse unmarshall(ListBuildPackResponse listBuildPackResponse, UnmarshallerContext _ctx) {
		
		listBuildPackResponse.setRequestId(_ctx.stringValue("ListBuildPackResponse.RequestId"));
		listBuildPackResponse.setCode(_ctx.integerValue("ListBuildPackResponse.Code"));
		listBuildPackResponse.setMessage(_ctx.stringValue("ListBuildPackResponse.Message"));

		List<BuildPack> buildPackList = new ArrayList<BuildPack>();
		for (int i = 0; i < _ctx.lengthValue("ListBuildPackResponse.BuildPackList.Length"); i++) {
			BuildPack buildPack = new BuildPack();
			buildPack.setConfigId(_ctx.longValue("ListBuildPackResponse.BuildPackList["+ i +"].ConfigId"));
			buildPack.setPackVersion(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].PackVersion"));
			buildPack.setTomcatDesc(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].TomcatDesc"));
			buildPack.setTomcatVersion(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].TomcatVersion"));
			buildPack.setTomcatDownloadUrl(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].TomcatDownloadUrl"));
			buildPack.setPandoraVersion(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].PandoraVersion"));
			buildPack.setPandoraDownloadUrl(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].PandoraDownloadUrl"));
			buildPack.setPandoraDesc(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].PandoraDesc"));
			buildPack.setPluginInfo(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].PluginInfo"));
			buildPack.setTomcatPath(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].TomcatPath"));
			buildPack.setImageId(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].ImageId"));
			buildPack.setTengineImageId(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].TengineImageId"));
			buildPack.setMultipleTenant(_ctx.booleanValue("ListBuildPackResponse.BuildPackList["+ i +"].MultipleTenant"));
			buildPack.setWithTengine(_ctx.booleanValue("ListBuildPackResponse.BuildPackList["+ i +"].WithTengine"));
			buildPack.setTengineDownloadUrl(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].TengineDownloadUrl"));
			buildPack.setScriptName(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].ScriptName"));
			buildPack.setScriptVersion(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].ScriptVersion"));
			buildPack.setFeature(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].Feature"));
			buildPack.setSupportFeatures(_ctx.stringValue("ListBuildPackResponse.BuildPackList["+ i +"].SupportFeatures"));
			buildPack.setDisabled(_ctx.booleanValue("ListBuildPackResponse.BuildPackList["+ i +"].Disabled"));

			buildPackList.add(buildPack);
		}
		listBuildPackResponse.setBuildPackList(buildPackList);
	 
	 	return listBuildPackResponse;
	}
}