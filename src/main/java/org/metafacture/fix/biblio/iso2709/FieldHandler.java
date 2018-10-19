/*
 * Copyright 2016 Christoph Böhme
 *
 * Licensed under the Apache License, Version 2.0 the "License";
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.metafacture.fix.biblio.iso2709;

/**
 * Callback interface defining the events emitted by
 * {@link Record#processFields(FieldHandler)}.
 *
 * @author Christoph Böhme
 */
public interface FieldHandler {

	void referenceField(char[] tag, char[] implDefinedPart, String value);

	void startDataField(char[] tag, char[] implDefinedPart, char[] indicators);

	void endDataField();

	void additionalImplDefinedPart(char[] implDefinedPart);

	void data(char[] identifier, String value);

}