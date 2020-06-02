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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.GetRepoTagManifestResponse;
import com.aliyuncs.cr.model.v20181201.GetRepoTagManifestResponse.Manifest;
import com.aliyuncs.cr.model.v20181201.GetRepoTagManifestResponse.Manifest.Config;
import com.aliyuncs.cr.model.v20181201.GetRepoTagManifestResponse.Manifest.FsLayersItem;
import com.aliyuncs.cr.model.v20181201.GetRepoTagManifestResponse.Manifest.HistoryItem;
import com.aliyuncs.cr.model.v20181201.GetRepoTagManifestResponse.Manifest.LayersItem;
import com.aliyuncs.cr.model.v20181201.GetRepoTagManifestResponse.Manifest.SignaturesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepoTagManifestResponseUnmarshaller {

	public static GetRepoTagManifestResponse unmarshall(GetRepoTagManifestResponse getRepoTagManifestResponse, UnmarshallerContext _ctx) {
		
		getRepoTagManifestResponse.setRequestId(_ctx.stringValue("GetRepoTagManifestResponse.RequestId"));
		getRepoTagManifestResponse.setIsSuccess(_ctx.booleanValue("GetRepoTagManifestResponse.IsSuccess"));
		getRepoTagManifestResponse.setCode(_ctx.stringValue("GetRepoTagManifestResponse.Code"));

		Manifest manifest = new Manifest();
		manifest.setSchemaVersion(_ctx.integerValue("GetRepoTagManifestResponse.Manifest.SchemaVersion"));
		manifest.setName(_ctx.stringValue("GetRepoTagManifestResponse.Manifest.Name"));
		manifest.setTag(_ctx.stringValue("GetRepoTagManifestResponse.Manifest.Tag"));
		manifest.setArchitecture(_ctx.stringValue("GetRepoTagManifestResponse.Manifest.Architecture"));
		manifest.setMediaType(_ctx.stringValue("GetRepoTagManifestResponse.Manifest.MediaType"));

		Config config = new Config();
		config.setMediaType(_ctx.stringValue("GetRepoTagManifestResponse.Manifest.Config.MediaType"));
		config.setSize(_ctx.longValue("GetRepoTagManifestResponse.Manifest.Config.Size"));
		config.setDigest(_ctx.stringValue("GetRepoTagManifestResponse.Manifest.Config.Digest"));
		manifest.setConfig(config);

		List<FsLayersItem> fsLayers = new ArrayList<FsLayersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRepoTagManifestResponse.Manifest.FsLayers.Length"); i++) {
			FsLayersItem fsLayersItem = new FsLayersItem();
			fsLayersItem.setBlobSum(_ctx.stringValue("GetRepoTagManifestResponse.Manifest.FsLayers["+ i +"].BlobSum"));

			fsLayers.add(fsLayersItem);
		}
		manifest.setFsLayers(fsLayers);

		List<HistoryItem> history = new ArrayList<HistoryItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRepoTagManifestResponse.Manifest.History.Length"); i++) {
			HistoryItem historyItem = new HistoryItem();
			historyItem.setV1Compatibility(_ctx.mapValue("GetRepoTagManifestResponse.Manifest.History["+ i +"].V1Compatibility"));

			history.add(historyItem);
		}
		manifest.setHistory(history);

		List<SignaturesItem> signatures = new ArrayList<SignaturesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRepoTagManifestResponse.Manifest.Signatures.Length"); i++) {
			SignaturesItem signaturesItem = new SignaturesItem();
			signaturesItem.setHeader(_ctx.mapValue("GetRepoTagManifestResponse.Manifest.Signatures["+ i +"].Header"));
			signaturesItem.setSignature(_ctx.stringValue("GetRepoTagManifestResponse.Manifest.Signatures["+ i +"].Signature"));
			signaturesItem.set_Protected(_ctx.stringValue("GetRepoTagManifestResponse.Manifest.Signatures["+ i +"].Protected"));

			signatures.add(signaturesItem);
		}
		manifest.setSignatures(signatures);

		List<LayersItem> layers = new ArrayList<LayersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRepoTagManifestResponse.Manifest.Layers.Length"); i++) {
			LayersItem layersItem = new LayersItem();
			layersItem.setMediaType(_ctx.stringValue("GetRepoTagManifestResponse.Manifest.Layers["+ i +"].MediaType"));
			layersItem.setSize(_ctx.longValue("GetRepoTagManifestResponse.Manifest.Layers["+ i +"].Size"));
			layersItem.setDigest(_ctx.stringValue("GetRepoTagManifestResponse.Manifest.Layers["+ i +"].Digest"));

			layers.add(layersItem);
		}
		manifest.setLayers(layers);
		getRepoTagManifestResponse.setManifest(manifest);
	 
	 	return getRepoTagManifestResponse;
	}
}