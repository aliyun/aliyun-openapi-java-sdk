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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetEditingProjectMaterialsResponse;
import com.aliyuncs.vod.model.v20170321.GetEditingProjectMaterialsResponse.Material;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEditingProjectMaterialsResponseUnmarshaller {

	public static GetEditingProjectMaterialsResponse unmarshall(GetEditingProjectMaterialsResponse getEditingProjectMaterialsResponse, UnmarshallerContext _ctx) {
		
		getEditingProjectMaterialsResponse.setRequestId(_ctx.stringValue("GetEditingProjectMaterialsResponse.RequestId"));

		List<Material> materialList = new ArrayList<Material>();
		for (int i = 0; i < _ctx.lengthValue("GetEditingProjectMaterialsResponse.MaterialList.Length"); i++) {
			Material material = new Material();
			material.setMaterialId(_ctx.stringValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].MaterialId"));
			material.setTitle(_ctx.stringValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].Title"));
			material.setTags(_ctx.stringValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].Tags"));
			material.setStatus(_ctx.stringValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].Status"));
			material.setSize(_ctx.longValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].Size"));
			material.setDuration(_ctx.floatValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].Duration"));
			material.setDescription(_ctx.stringValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].Description"));
			material.setCreationTime(_ctx.stringValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].CreationTime"));
			material.setModifiedTime(_ctx.stringValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].ModifiedTime"));
			material.setCoverURL(_ctx.stringValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].CoverURL"));
			material.setCateId(_ctx.integerValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].CateId"));
			material.setCateName(_ctx.stringValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].CateName"));
			material.setSource(_ctx.stringValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].Source"));
			material.setSpriteConfig(_ctx.stringValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].SpriteConfig"));
			material.setMaterialType(_ctx.stringValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].MaterialType"));

			List<String> snapshots = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].Snapshots.Length"); j++) {
				snapshots.add(_ctx.stringValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].Snapshots["+ j +"]"));
			}
			material.setSnapshots(snapshots);

			List<String> sprites = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].Sprites.Length"); j++) {
				sprites.add(_ctx.stringValue("GetEditingProjectMaterialsResponse.MaterialList["+ i +"].Sprites["+ j +"]"));
			}
			material.setSprites(sprites);

			materialList.add(material);
		}
		getEditingProjectMaterialsResponse.setMaterialList(materialList);
	 
	 	return getEditingProjectMaterialsResponse;
	}
}