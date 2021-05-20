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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ListCustomPersonsResponse;
import com.aliyuncs.mts.model.v20140618.ListCustomPersonsResponse.Category;
import com.aliyuncs.mts.model.v20140618.ListCustomPersonsResponse.Category.Person;
import com.aliyuncs.mts.model.v20140618.ListCustomPersonsResponse.Category.Person.Face;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomPersonsResponseUnmarshaller {

	public static ListCustomPersonsResponse unmarshall(ListCustomPersonsResponse listCustomPersonsResponse, UnmarshallerContext _ctx) {
		
		listCustomPersonsResponse.setRequestId(_ctx.stringValue("ListCustomPersonsResponse.RequestId"));

		List<Category> categories = new ArrayList<Category>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomPersonsResponse.Categories.Length"); i++) {
			Category category = new Category();
			category.setCategoryId(_ctx.stringValue("ListCustomPersonsResponse.Categories["+ i +"].CategoryId"));
			category.setCategoryName(_ctx.stringValue("ListCustomPersonsResponse.Categories["+ i +"].CategoryName"));
			category.setCategoryDescription(_ctx.stringValue("ListCustomPersonsResponse.Categories["+ i +"].CategoryDescription"));

			List<Person> persons = new ArrayList<Person>();
			for (int j = 0; j < _ctx.lengthValue("ListCustomPersonsResponse.Categories["+ i +"].Persons.Length"); j++) {
				Person person = new Person();
				person.setPersonName(_ctx.stringValue("ListCustomPersonsResponse.Categories["+ i +"].Persons["+ j +"].PersonName"));
				person.setPersonDescription(_ctx.stringValue("ListCustomPersonsResponse.Categories["+ i +"].Persons["+ j +"].PersonDescription"));
				person.setPersonId(_ctx.stringValue("ListCustomPersonsResponse.Categories["+ i +"].Persons["+ j +"].PersonId"));

				List<Face> faces = new ArrayList<Face>();
				for (int k = 0; k < _ctx.lengthValue("ListCustomPersonsResponse.Categories["+ i +"].Persons["+ j +"].Faces.Length"); k++) {
					Face face = new Face();
					face.setImageUrl(_ctx.stringValue("ListCustomPersonsResponse.Categories["+ i +"].Persons["+ j +"].Faces["+ k +"].ImageUrl"));
					face.setFaceId(_ctx.stringValue("ListCustomPersonsResponse.Categories["+ i +"].Persons["+ j +"].Faces["+ k +"].FaceId"));

					faces.add(face);
				}
				person.setFaces(faces);

				persons.add(person);
			}
			category.setPersons(persons);

			categories.add(category);
		}
		listCustomPersonsResponse.setCategories(categories);
	 
	 	return listCustomPersonsResponse;
	}
}