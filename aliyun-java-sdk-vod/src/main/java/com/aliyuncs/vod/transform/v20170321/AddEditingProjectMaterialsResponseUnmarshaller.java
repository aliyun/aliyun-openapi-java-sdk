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

import com.aliyuncs.vod.model.v20170321.AddEditingProjectMaterialsResponse;
import com.aliyuncs.vod.model.v20170321.AddEditingProjectMaterialsResponse.Material;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddEditingProjectMaterialsResponseUnmarshaller {

	public static AddEditingProjectMaterialsResponse unmarshall(AddEditingProjectMaterialsResponse addEditingProjectMaterialsResponse, UnmarshallerContext _ctx) {
		
		addEditingProjectMaterialsResponse.setRequestId(_ctx.stringValue("AddEditingProjectMaterialsResponse.RequestId"));

		List<Material> materialList = new ArrayList<Material>();
		for (int i = 0; i < _ctx.lengthValue("AddEditingProjectMaterialsResponse.MaterialList.Length"); i++) {
			Material material = new Material();
			material.setStatus(_ctx.stringValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].Status"));
			material.setCateId(_ctx.integerValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].CateId"));
			material.setCreateTime(_ctx.stringValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].CreateTime"));
			material.setMaterialType(_ctx.stringValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].MaterialType"));
			material.setTags(_ctx.stringValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].Tags"));
			material.setSpriteConfig(_ctx.stringValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].SpriteConfig"));
			material.setCateName(_ctx.stringValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].CateName"));
			material.setDescription(_ctx.stringValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].Description"));
			material.setMaterialId(_ctx.stringValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].MaterialId"));
			material.setSize(_ctx.longValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].Size"));
			material.setCoverURL(_ctx.stringValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].CoverURL"));
			material.setDuration(_ctx.floatValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].Duration"));
			material.setCustomerId(_ctx.longValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].CustomerId"));
			material.setTitle(_ctx.stringValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].Title"));
			material.setModifyTime(_ctx.stringValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].ModifyTime"));

			List<String> sprites = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].Sprites.Length"); j++) {
				sprites.add(_ctx.stringValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].Sprites["+ j +"]"));
			}
			material.setSprites(sprites);

			List<String> snapshots = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].Snapshots.Length"); j++) {
				snapshots.add(_ctx.stringValue("AddEditingProjectMaterialsResponse.MaterialList["+ i +"].Snapshots["+ j +"]"));
			}
			material.setSnapshots(snapshots);

			materialList.add(material);
		}
		addEditingProjectMaterialsResponse.setMaterialList(materialList);
	 
	 	return addEditingProjectMaterialsResponse;
	}
}