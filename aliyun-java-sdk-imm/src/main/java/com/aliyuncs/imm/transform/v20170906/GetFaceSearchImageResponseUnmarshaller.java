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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.GetFaceSearchImageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFaceSearchImageResponseUnmarshaller {

	public static GetFaceSearchImageResponse unmarshall(GetFaceSearchImageResponse getFaceSearchImageResponse, UnmarshallerContext _ctx) {
		
		getFaceSearchImageResponse.setRequestId(_ctx.stringValue("GetFaceSearchImageResponse.RequestId"));
		getFaceSearchImageResponse.setGroupName(_ctx.stringValue("GetFaceSearchImageResponse.GroupName"));
		getFaceSearchImageResponse.setGroupId(_ctx.stringValue("GetFaceSearchImageResponse.GroupId"));
		getFaceSearchImageResponse.setGender(_ctx.stringValue("GetFaceSearchImageResponse.Gender"));
		getFaceSearchImageResponse.setAge(_ctx.integerValue("GetFaceSearchImageResponse.Age"));
		getFaceSearchImageResponse.setPitch(_ctx.floatValue("GetFaceSearchImageResponse.Pitch"));
		getFaceSearchImageResponse.setImageUri(_ctx.stringValue("GetFaceSearchImageResponse.ImageUri"));
		getFaceSearchImageResponse.setImageMd5(_ctx.stringValue("GetFaceSearchImageResponse.ImageMd5"));
		getFaceSearchImageResponse.setRoll(_ctx.floatValue("GetFaceSearchImageResponse.Roll"));
		getFaceSearchImageResponse.setFaceId(_ctx.stringValue("GetFaceSearchImageResponse.FaceId"));
		getFaceSearchImageResponse.setYaw(_ctx.floatValue("GetFaceSearchImageResponse.Yaw"));
		getFaceSearchImageResponse.setQuality(_ctx.floatValue("GetFaceSearchImageResponse.Quality"));
		getFaceSearchImageResponse.setHat(_ctx.integerValue("GetFaceSearchImageResponse.Hat"));
		getFaceSearchImageResponse.setGlasses(_ctx.integerValue("GetFaceSearchImageResponse.Glasses"));
		getFaceSearchImageResponse.setImageId(_ctx.stringValue("GetFaceSearchImageResponse.ImageId"));
		getFaceSearchImageResponse.setUser(_ctx.stringValue("GetFaceSearchImageResponse.User"));

		List<String> axis = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetFaceSearchImageResponse.Axis.Length"); i++) {
			axis.add(_ctx.stringValue("GetFaceSearchImageResponse.Axis["+ i +"]"));
		}
		getFaceSearchImageResponse.setAxis(axis);
	 
	 	return getFaceSearchImageResponse;
	}
}